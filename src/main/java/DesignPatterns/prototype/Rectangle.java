package DesignPatterns.prototype;

public class Rectangle extends Figure implements Cloneable {

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(name);
    }

    @Override
    public void draw() {
        System.out.println(name);
    }


}
