package DesignPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<Figure> figures = new ArrayList<>();

        Figure one = new Circle("Koło");
        Figure two = new Rectangle("Kwadrat");
        Figure three = new Rectangle("Prawie trapez");

        figures.add(one);
        figures.add(two);
        figures.add(three);

        FigureCache cache = new FigureCache();

        cache.addFromList(figures);

        cache.showCache();

        one.setName("Jajko");
        two.setName("Prostokąt");
        three.setName("Wkońcu Trapez");

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);


        cache.showCache();
    }
}
