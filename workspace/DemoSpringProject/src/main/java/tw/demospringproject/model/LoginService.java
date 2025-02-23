package tw.demospringproject.model;

public class LoginService {

	public LoginDao loginDao;

	public LoginService() {
	}

	// Constructor Dependency Injection(Constructor DI)
	public LoginService(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	// Setter Dependency Injection(Setter DI)
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public boolean checkLogin(String user, String pwd) {
		return loginDao.checkLogin(user, pwd);
	}
}
