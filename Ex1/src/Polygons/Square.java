package Polygons;
import java.awt.*;

public class Square extends Polygon {

    public Square(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics g) {
        Point currentCenter = centerPoint;
        g.drawRect(currentCenter.x - 10, currentCenter.y - 10, 20, 20);
    }
}
