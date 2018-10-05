package DesignPatterns.composite;

public abstract class ProductAbstract {

    protected abstract String getProductName();

    public void showMe() {
        System.out.println("Produkt" + " " + this.getProductName());
    }

    public abstract void addChild(ProductAbstract p);

    public abstract void removeChild(ProductAbstract p);
}
