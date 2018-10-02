package DesignPatterns.command;

public class LogoutCommand implements Command {

    private User user;

    public LogoutCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        System.out.println("Wylogowano");
        user.setToken(null);
    }
}
