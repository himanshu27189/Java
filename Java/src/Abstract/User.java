package Abstract;

public class User {
public static void main(String[] args) {
	
	Instagram i = new InstaImpl();
	i.login();
	i.post();
	i.logout();
}
}
