package DesignPatterns.decorator.pizza;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        this.pizza.bake();
    }
}
