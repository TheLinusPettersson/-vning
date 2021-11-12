package Polygons;
import java.awt.*;

abstract public class Polygon {
    protected Point centerPoint;

    private Polygon(Point point){
        centerPoint = point;
    }
    public Polygon(int x, int y){
        this(new Point(x, y));
    }
    public abstract void paint(Graphics g);
}

