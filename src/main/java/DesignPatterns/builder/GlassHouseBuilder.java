package DesignPatterns.builder;

public class GlassHouseBuilder extends HouseBuilder {


    @Override
    public House build() {
        return new House("glass", windowsType, "glass", houseName);
    }
}
