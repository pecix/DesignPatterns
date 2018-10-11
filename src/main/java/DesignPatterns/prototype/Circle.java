package DesignPatterns.prototype;

public class Circle extends Figure implements Cloneable {

    public Circle(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(name);
    }

    @Override
    public void draw() {
        System.out.println(name);
    }


}
