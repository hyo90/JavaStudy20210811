package b20_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao {//LoginDao임플리먼트함 상속
	private DBConnectionMgr pool;   // DB~#@# + ctrl + spce = 자동 import
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	} //풀장에 들어가려고 티켓  발급받은상황
	
//  로그인 로직 (로그인 성공하면 몇번, 아이디만 맞는지 비번만 틀리는지 )
	@Override
	public int login(String id, String password) { //로그인이라는
		Connection con = null;
		PreparedStatement pstmt = null; // PreparedStatement란... .ㅎ...
		ResultSet rs = null;
		String sql = null;
		int flag = 0;
		
		try {
			con = pool.getConnection(); //db에 들어갈거다~~ con(커넥션)은 풀장에 드간거임
			sql = "select count(um.user_id), count(ud.user_id) from " //sql쿼립/드러가서 설렉할거임
					+ "user_mst um"
					+ "left outer jonin user_mst ud on (ud.user_id = um.user.id and ud.user_password = ?)" //um=usermaster
					+ "where um.user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			rs = pstmt.executeQuery(); //executeQuery 쿼리실행 ctrl + f9한거임..... 그 결과를 리절트셋에 담음
			
			rs.next();
			flag = rs.getInt(1) + rs.getInt(2);  //rs.next()의 첫번쨰 컬럼
				// 1행(아이디) 2행(패스워드) = 2가 되어야 .. 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			pool.freeConnection(con, pstmt, rs); //알아서반납
		}
		
		return flag;
		
		
	}
	
	
	@Override
	public String getLoginUserName(String id) {
		Connection con = null;
		PreparedStatement pstmt = null; // PreparedStatement란... .ㅎ...
		ResultSet rs = null;
		String sql = null;
		String name = null;
		
		try {
			con = pool.getConnection(); //db에 들어갈거다~~ con(커넥션)은 풀장에 드간거임
			sql = "select user_name from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); //executeQuery 쿼리실행 ctrl + f9한거임..... 그 결과를 리절트셋에 담음
			
			rs.next();
			int flag = rs.getInt(1) + rs.getInt(2);  //rs.next()의 첫번쨰 컬럼
				// 1행(아이디) 2행(패스워드) = 2가 되어야 .. 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			pool.freeConnection(con, pstmt, rs); //알아서반납
		}
		
		return name;
	}
}
