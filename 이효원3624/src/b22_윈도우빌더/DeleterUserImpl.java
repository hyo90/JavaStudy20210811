package b22_À©µµ¿ìºô´õ;

import java.sql.Connection;

import db.DBConnectionMgr;

public class DeleterUserImpl implements DeleteUserDto {
	private DBConnectionMgr pool;
	
	public DeleteUserDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public boolean deleteUser(String id) {
		Connection con = null;
		PreparedStatment pstmt = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "delete from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			
			flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			pool.freeConnection(con, pstmt);
		}
		
		return flag;
	}
	
	

}
