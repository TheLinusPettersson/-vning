import javax.swing.*;

class PolygonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);
    }
}