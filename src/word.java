import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

public class word extends JApplet {
    public void paint(Graphics canvas){
        Font font = new Font("Blackadder ITC",Font.BOLD,100);
        canvas.setFont(font);
        canvas.drawString("Hello World!",750,400);
        canvas.drawLine(1500,450,250,450);

    }
}
