package app;

import java.awt.*;

public class ConcreteFigure implements Figure{

    private String shape;
    private String color;

    public ConcreteFigure(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return firstLetterToUpperCase(color) + shape;
    }

    @Override
    public void draw(int x, int y) {
        System.out.printf("Draw %s %s at position (%d;%d)", color, shape, x, y);
    }

    private String firstLetterToUpperCase(String string){
        return string.substring(0 ,1).toUpperCase() + string.substring(1);
    }
}
