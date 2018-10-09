package DesignPatterns.observer;

public interface Observer {

    void register(Subject subject);

    void unregister(Subject subject);

    void update(String message);

}
