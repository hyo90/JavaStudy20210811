package b22_���������.service;

public interface SignUpService {
	public boolean isEmptyId(String id);
	public int idCheck(String id);
	public String isEmptyValues(String[] values);
	public String  equalsPassword(String pwd, String repwd);
}
