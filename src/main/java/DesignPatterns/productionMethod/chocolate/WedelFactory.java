package DesignPatterns.productionMethod.chocolate;

public class WedelFactory implements ChocolateFactory {


    @Override
    public Chocolate create(ChocolateType chocolateType) {
        switch (chocolateType) {
            case MILK_CHOCOLATE:
                return new MilkChocolate();
            case DARK_CHOCOLATE:
                return new DarkChocloate();
            case NUTS_CHOCOLATE:
                return new NutsChocolate();
        }
        throw new IllegalArgumentException("Nie ma takiej czekolady: " + chocolateType);
    }
}
