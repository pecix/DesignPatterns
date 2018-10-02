package DesignPatterns.command;

public class LoginCommand implements Command {

    private User user;
    private String token;

    public LoginCommand(User user, String token) {
        this.user = user;
        this.token = token;
    }

    @Override
    public void execute() {
        if (token != null) {
            System.out.println("Zalogowano");
            user.setToken(token);
        }
    }

}
