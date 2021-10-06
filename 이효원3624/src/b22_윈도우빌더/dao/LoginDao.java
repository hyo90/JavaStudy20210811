package b22_孺紫辦網渦.dao;

import b22_孺紫辦網渦.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password);
	public String getLoginUserName(String id);
	public UserDto getUserDto(String id);
}
