package DesignPatterns.decorator.pizza;

public class MushroomsPizza extends PizzaDecorator {


    public MushroomsPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("+ Grzybki");
    }
}
