package DesignPatterns.decorator.pizza;

public class PizzaDecoratoTest {

    public static void main(String[] args) {
        Pizza hamPizza = new HamPizza(new BasicPizza());
        hamPizza.bake();
        System.out.println("\n*****");
        Pizza mushroomPizza = new MushroomsPizza(new BasicPizza());
        mushroomPizza.bake();
        System.out.println("\n*****");
        Pizza capriciosa = new HamPizza(new MushroomsPizza(new BasicPizza()));
        capriciosa.bake();
    }
}
