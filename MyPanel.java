import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    Image image;

    public MyPanel() {
        this.setPreferredSize(new Dimension(1200,1200));
        image = new ImageIcon("background.png").getImage();

    }

    public void paint(Graphics g)
    {
        Graphics2D g2D = (Graphics2D) g;


        g2D.drawImage(image, 0, 0, null);
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));


        //g2D.drawLine(0, 0, 500, 500);
        //g2D.drawRect(0, 0, 100, 100);
        //g2D.fillRect(0,0,100,100);


        //POKEBALL
//        g2D.setPaint(Color.red);
//        g2D.fillArc(0, 20, 100, 100, 0, 180);
//        g2D.setPaint(Color.gray);
//        g2D.fillArc(0, 20, 100, 100, 180, 180);


        /*
        TRIANGLE
        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        //g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);
         */
        g2D.setFont(new Font("Ink Free", Font.BOLD,25));
        g2D.drawString("DO you see me as more than a friend?", 50, 50);










    }
}
