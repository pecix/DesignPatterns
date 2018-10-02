package DesignPatterns.command;

public class Facebook {
    private static final String token = "TKOEN";

    public static void main(String[] args) {

        LoginManager loginManager = new LoginManager();
        User user = new User();
        Command login = new LoginCommand(user, token);
        Command logout = new LogoutCommand(user);
        Command isLogin = new IsLoginCommand(user);

        loginManager.setCommand(login);
        loginManager.handleCommand();

        loginManager.setCommand(isLogin);
        loginManager.handleCommand();

        System.out.println("--------------------");

        loginManager.setCommand(logout);
        loginManager.handleCommand();

        loginManager.setCommand(isLogin);
        loginManager.handleCommand();
    }

}
