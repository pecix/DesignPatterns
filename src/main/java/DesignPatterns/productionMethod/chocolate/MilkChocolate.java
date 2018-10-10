package DesignPatterns.productionMethod.chocolate;

public class MilkChocolate extends Chocolate {

    protected String description = "Czekolada mleczna";

    @Override
    String getDescription() {
        return description;
    }
}
