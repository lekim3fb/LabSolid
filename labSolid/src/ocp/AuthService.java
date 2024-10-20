package ocp;

public class AuthService {
	private IInitializable ini;
	
	public AuthService(IInitializable ini) {
		this.ini = ini;
	}
	
	public boolean SingIn(String us, String pass) {
		return ini.getInit(us, pass);
	}

}
