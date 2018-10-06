package DesignPatterns.decorator.pizza;

public class HamPizza extends PizzaDecorator {


    public HamPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("+ Szynka");
    }
}
