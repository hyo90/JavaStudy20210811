package b22_���������.service;

import b22_���������.dao.LoginDao;
import b22_���������.dao.LoginDaoImpl;
import b22_���������.dto.UserDto;

/**
 * 
 * MVC Model
 * 
 * M : Model : DB�� �ٸ� �����͵��� ���� �� �ִ� ������ �Ǿ���Ѵ�.(DAO, DTO, VO, Bean)
 * V : View : ����ڰ� ���� ȭ��
 * C : Controller : ����ڿ��� � View�� �����ٰ����� ��Ʈ���ؾ���.
 * 
 *
 */

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}
	
	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;
		//���̵� ������ flag�� 3�� 3�̸� ���̵� �Է� x 
		if (id.length() == 0) {
			flag = 3;
		}else if (pwd.length() == 0) {
			flag = 4;
		}else {
			flag = loginLogic(id, pwd);
		}
		return flag;
	}
	
	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
}
	
	@Override
	public UserDto getUserDto(String id) {
		return loginDao.getUserDto(id);
	}
}