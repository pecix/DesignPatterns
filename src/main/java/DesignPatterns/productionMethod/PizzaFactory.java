package DesignPatterns.productionMethod;

public class PizzaFactory {

    public enum PizzaType {
        MUSHROOM, HAM, DELUXE
    }

    public static Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case MUSHROOM:
                return new MushroomPizza();
            case HAM:
                return new HamPizza();
            case DELUXE:
                return new DeluxePizza();
        }
        throw new IllegalArgumentException("The pizza type " + pizzaType + " is not recognized");
    }
}
