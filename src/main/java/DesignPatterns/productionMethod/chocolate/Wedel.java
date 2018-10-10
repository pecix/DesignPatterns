package Playground.designPatterns.productionMethod.chocolate;

public class Wedel {
    public static void main(String[] args) {

        WedelFactory factory = new WedelFactory();

        System.out.println(factory.create(ChocolateType.MILK_CHOCOLATE).getDescription());
        System.out.println(factory.create(ChocolateType.DARK_CHOCOLATE).getDescription());
        System.out.println(factory.create(ChocolateType.NUTS_CHOCOLATE).getDescription());

    }

}
