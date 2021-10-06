package b22_윈도우빌더.service;

import b22_윈도우빌더.dao.LoginDao;
import b22_윈도우빌더.dao.LoginDaoImpl;
import b22_윈도우빌더.dto.UserDto;

/**
 * 
 * MVC Model
 * 
 * M : Model : DB나 다른 데이터들을 담을 수 있는 영역이 되어야한다.(DAO, DTO, VO, Bean)
 * V : View : 사용자가 보는 화면
 * C : Controller : 사용자에게 어떤 View를 보여줄건지만 컨트롤해야함.
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
		//아이디가 없으면 flag에 3을 3이면 아이디 입력 x 
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