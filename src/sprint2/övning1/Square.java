package sprint2.övning1;

/**
 * Created by rakib
 * Date: 2020-10-06
 * Time: 07:05
 * Projekt: SigrunÖvninger
 * Copyright: MIT
 */
public class Square implements IFigure {
    protected int length;
    protected int width;

    public Square(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getirCumference() {
        return (2 * (length+width));
    }
}
