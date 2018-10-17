package DesignPatterns.singleton;

public class Singleton {
    public static void main(String[] args) {

        User user = new User("pecix");

        Session session = Session.getInstance();

        System.out.println(session.getLoggedUser());
        session.loginUser(user);
        System.out.println(session.getLoggedUser());
        session.logoutUser();
        System.out.println(session.getLoggedUser());

    }
}
