package DesignPatterns.observer;

public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void register(Subject subject) {
        subject.register(this);
    }

    @Override
    public void unregister(Subject subject) {
        subject.unregister(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}
