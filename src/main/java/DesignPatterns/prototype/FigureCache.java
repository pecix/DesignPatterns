package DesignPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class FigureCache implements Cloneable {

    private List<Figure> figureCache = new ArrayList<>();

    public void add(Figure figure) throws CloneNotSupportedException {
        figureCache.add((Figure) figure.clone());
    }

    public void addFromList(List<Figure> figures) throws CloneNotSupportedException {
        for (Figure figure : figures) {
            figureCache.add((Figure) figure.clone());
        }

    }

    public void removeCache() {
        figureCache.clear();
    }

    public void showCache() {
        for (Figure figure : figureCache) {
            System.out.println(figure);
        }
    }

}
