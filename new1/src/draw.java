import javax.swing.*;
import java.awt.*;

public class draw extends JPanel {
    public void paintComponent(Graphics g){
        this.setBackground(Color.RED);

        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(190,81,215));
        g.fillRect(25, 65 ,100 , 30 );

        g.setColor(Color.WHITE);
        g.drawString("this is text", 55,40 );

        g.setColor(Color.WHITE);
        g.drawString("this is text",55,80);

    }
}
