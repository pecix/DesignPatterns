package DesignPatterns.command;

public class LoginManager {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void handleCommand() {
        command.execute();
    }


}
