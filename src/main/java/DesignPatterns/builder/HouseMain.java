package DesignPatterns.builder;

public class HouseMain {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new WoodenHouseBuilder();
        houseBuilder.setHouseName("wooden House");
        houseBuilder.setWindowsType("plastic");
        House house = houseBuilder.build();
        System.out.println(house);
    }
}
