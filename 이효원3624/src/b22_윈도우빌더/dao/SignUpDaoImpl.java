package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class SignUpDaoImpl implements SignUpDao {

	private DBConnectionMgr pool;
	
	public SignUpDaoImpl() {
		pool = DBConnectionMgr.getInstance();
		
	}
	
	
	@Override
	public int idCheck(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 2;
		
		try {
			con = pool.getConnection();
			sql = "select count(user_id) from user_mst where user_id = ?"; //sql에서 가져오는.... 그런..것..
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			flag = rs.getInt(1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //드라이버가 없을수도이땅 겟커넥션에 마우스 
		
		
		
		
		return flag;
	}
	

}
