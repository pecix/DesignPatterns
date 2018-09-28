package DesignPatterns.builder;

public class WoodenHouseBuilder extends HouseBuilder {


    @Override
    public House build() {
        return new House("wood", windowsType, "wood", houseName);
    }
}
