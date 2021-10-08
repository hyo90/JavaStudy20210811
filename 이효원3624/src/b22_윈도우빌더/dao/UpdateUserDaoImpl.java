package b22_À©µµ¿ìºô´õ.dao;

import db.DBConnectionMgr;

public class UpdateUserDaoImpl implements UpdateUserDao {
	
	private DBConnectiongMGR pool = null;
	
	public UpdateUserDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public boolean updatePassword(String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			con = pool.getConnection();
			sql = u"update user_mst set user_password = ? where use_id = ?";
		} catch (Exception e) {
		e.printStacktrace();
		
		}
		
		
		
		
		return flag;
	}

}
