package DesignPatterns.mediator;

public class ChatClient {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();

        User userOne = new UserImpl(mediator, "User One");
        User userTwo = new UserImpl(mediator, "User Teo");
        User userThree = new UserImpl(mediator, "User Three");
        User userFour = new UserImpl(mediator, "User Four");

        mediator.addUser(userOne);
        mediator.addUser(userTwo);
        mediator.addUser(userThree);
        mediator.addUser(userFour);

        userOne.send("Hi all :)");
    }
}
