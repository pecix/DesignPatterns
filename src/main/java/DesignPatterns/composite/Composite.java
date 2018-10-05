package DesignPatterns.composite;

import java.util.ArrayList;

public class Composite extends ProductAbstract {

    private ArrayList<ProductAbstract> _children = new ArrayList<ProductAbstract>();

    String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    protected String getProductName() {
        return name;
    }

    @Override
    public void showMe() {
        super.showMe();
        for (ProductAbstract pa : _children) {
            pa.showMe();
        }
    }

    @Override
    public void addChild(ProductAbstract p) {
        _children.add(p);
    }

    @Override
    public void removeChild(ProductAbstract p) {
        _children.remove(p);
    }
}
