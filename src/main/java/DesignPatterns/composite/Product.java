package DesignPatterns.composite;

public class Product extends ProductAbstract {

    String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    protected String getProductName() {
        return name;
    }

    @Override
    public void addChild(ProductAbstract p) {
        System.out.println("Nie można dodać.");
    }

    @Override
    public void removeChild(ProductAbstract p) {
        System.out.println("Brak dzieci.");
    }
}
