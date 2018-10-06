package DesignPatterns.decorator.pizza;

public class BasicPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Margherita");
    }
}
