package DesignPatterns.mediator.GUIMediator;

public class App {
    public static void main(String[] args) {
        UIContainer uiContainer = new AppContainer();

        Component button1 = new ButtonComponent(uiContainer, "Button One");
        Component button2 = new ButtonComponent(uiContainer, "Button Two");
        Component checkbox = new CheckBoxComponent(uiContainer, "checkbox");

        uiContainer.addComponent(button1);
        uiContainer.addComponent(button2);
        uiContainer.addComponent(checkbox);

        checkbox.click();
        button1.click();
        button2.click();


    }
}
