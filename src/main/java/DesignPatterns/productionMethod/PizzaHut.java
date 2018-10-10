package Playground.designPatterns.productionMethod;

public class PizzaHut {
    public static void main(String[] args) {
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
            System.out.println("Price of " + pizzaType + " is " + PizzaFactory.createPizza(pizzaType).getPrice());
        }
    }
}
