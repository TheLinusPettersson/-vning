package Polygons;
import java.awt.*;

public class Rectangle extends Polygon {
    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics g) {
        Point currentCenter = centerPoint;
        g.drawRect(currentCenter.x -20, currentCenter.y -10, 40, 20);
    }
}
