package DesignPatterns.mediator.GUIMediator;

import java.util.ArrayList;
import java.util.List;

public class AppContainer implements UIContainer {

    private List<Component> components = new ArrayList<>();

    @Override
    public void onComponentClick(Component component) {
        for (Component comp : components) {
            if (comp != component) {
                comp.onClick(component);
            }
        }
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }
}
