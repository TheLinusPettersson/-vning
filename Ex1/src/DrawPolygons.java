import Polygons.Polygon;
import Polygons.Rectangle;
import Polygons.Square;
import Polygons.Triangle;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DrawPolygons extends Component{
    public ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>(10);
        Polygon square = new Square(100, 100);
        Polygon triangle = new Triangle(150, 150);
        Polygon rectangle = new Rectangle(100, 200);
        polygons.add(square);
        polygons.add(triangle);
        polygons.add(rectangle);

    }//constructor

    @Override
    public void paint(Graphics g) {
        for (Polygon currentPolygon : polygons) {
            currentPolygon.paint(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons