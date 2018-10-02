package DesignPatterns.command;

public class IsLoginCommand implements Command {

    User user;

    public IsLoginCommand(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
        if (user.getToken() != null) {
            System.out.println("User is logged");
        } else {
            System.out.println("User is not logged");
        }
    }
}
