package DesignPatterns.prototype;

public abstract class Figure implements Cloneable {

    protected String name;

    public abstract void draw();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                '}';
    }
}
