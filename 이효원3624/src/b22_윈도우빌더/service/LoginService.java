package b22_���������.service;

import b22_���������.dto.UserDto;

public interface LoginService {
	public int loginTextCheck(String id, String pwd);
	public int loginLogic(String id, String pwd);
	public UserDto getUserDto(String id);
}
