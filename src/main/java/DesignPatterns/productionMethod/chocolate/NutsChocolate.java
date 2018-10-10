package DesignPatterns.productionMethod.chocolate;

public class NutsChocolate extends Chocolate {

    protected String description = "Czekolada z orzechami";

    @Override
    String getDescription() {
        return description;
    }
}
