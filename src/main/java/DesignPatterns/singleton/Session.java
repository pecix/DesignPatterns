package DesignPatterns.singleton;

public class Session {
    private static Session session;
    private User loggedUser;

    private Session() {
    }

    public static Session getInstance() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void loginUser(User user) {
        loggedUser = user;
    }

    public void logoutUser() {
        loggedUser = null;
    }

    public String getLoggedUser() {
        if (loggedUser == null) {
            return "None";
        }
        return loggedUser.getLogin();
    }
}
