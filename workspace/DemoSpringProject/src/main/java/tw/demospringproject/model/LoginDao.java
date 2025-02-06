package tw.demospringproject.model;

public class LoginDao {
	
	

	public boolean checkLogin(String user,String pwd) {
		if("john".equals(user) && "test123".equals(pwd)) { //equals較明確的放左邊 如果user放左邊 無輸入的時候會是null 這樣會產生nullexception
			return true;
		}
		
		return false;
	}
	
}
