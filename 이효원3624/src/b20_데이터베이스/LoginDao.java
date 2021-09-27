package b20_데이터베이스;

public interface LoginDao {
	public int login(String id, String password);
	public String getLoginUserName(String id);
	
}
