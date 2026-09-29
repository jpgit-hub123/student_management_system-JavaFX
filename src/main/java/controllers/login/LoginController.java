package controllers.login;

public class LoginController {
    public boolean checkUsernameAndPassword(String username, String password) {
        return username.equals("Pathum") && password.equals("1234");
    }
}
