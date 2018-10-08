package DesignPatterns.mediator.GUIMediator;

public interface UIContainer {

    void onComponentClick(Component component);

    void addComponent(Component component);
}
