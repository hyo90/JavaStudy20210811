package b22_���������.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import b22_���������.dto.UserDto;
import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao {//LoginDao���ø���Ʈ�� ���
	private DBConnectionMgr pool;   // DB~#@# + ctrl + spce = �ڵ� import
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	} //Ǯ�忡 ������ Ƽ��  �߱޹�����Ȳ
	
//  �α��� ���� (�α��� �����ϸ� ���, ���̵� �´��� ����� Ʋ������ )
	@Override
	public int login(String id, String password) { //�α����̶��
		Connection con = null;
		PreparedStatement pstmt = null; // PreparedStatement��... .��...
		ResultSet rs = null;
		String sql = null;
		int flag = 0;
		
		try {
			con = pool.getConnection(); //db�� ���Ŵ�~~ con(Ŀ�ؼ�)�� Ǯ�忡 �尣����
			sql = "select count(um.user_id), count(ud.user_id) from " //sql����/�巯���� �����Ұ���
					+ "user_mst um"
					+ "left outer jonin user_mst ud on (ud.user_id = um.user.id and ud.user_password = ?)" //um=usermaster
					+ "where um.user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery(); //executeQuery �������� ctrl + f9�Ѱ���..... �� ����� ����Ʈ�¿� ����
			
			rs.next();
			flag = rs.getInt(1) + rs.getInt(2);  //rs.next()�� ù���� �÷�
				// 1��(���̵�) 2��(�н�����) = 2�� �Ǿ�� .. 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			pool.freeConnection(con, pstmt, rs); //�˾Ƽ��ݳ�
		}
		
		return flag;
		
		
	}
	
	
	@Override
	public String getLoginUserName(String id) {
		Connection con = null;
		PreparedStatement pstmt = null; // PreparedStatement��... .��...
		ResultSet rs = null;
		String sql = null;
		String name = null;
		
		try { //���⼭ try ����.. 1. Ŀ�ؼ� �ϴ� ����
			con = pool.getConnection(); //db�� ���Ŵ�~~ con(Ŀ�ؼ�)�� Ǯ�忡 �尣����
			sql = "select user_name from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); //executeQuery �������� ctrl + f9�Ѱ���..... �� ����� ����Ʈ�¿� ����
			
			rs.next();
			int flag = rs.getInt(1) + rs.getInt(2);  //rs.next()�� ù���� �÷�
				// 1��(���̵�) 2��(�н�����) = 2�� �Ǿ�� .. 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			pool.freeConnection(con, pstmt, rs); //�˾Ƽ��ݳ�
		}
		
		return name;
	}
	
	@Override
	public UserDto getUserDto(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String name = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from use_mst where user_id = ?";
			pstmt = con.prepareStatment(sql);
			pstmt.setNString(1,  id);
			rs = pstmt.executeQuery();
			
			rs.next();
			UserDto userDto = new UserDto();
			userDto.setUser_id(rs.getString(1));
			userDto.setUser_pwd(rs.getString(2));
			userDto.setUser_name(rs.getString(3));
			userDto.setUser_phone(rs.getString(4));
			userDto.setUser_email(rs.getString(5));
			userDto.setUser_gender(rs.getInt(6));
			
			return userDto;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return null;
	}
}
