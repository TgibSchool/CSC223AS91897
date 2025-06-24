
/**
 * Main Body for AS91897 Project
 *
 * @author Thomas
 * @version 3
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame //implements ActionListener 
{
    Canvas myCanvas;
    final String fileName ="CharaterStanding1.png";
    ImageIcon image = new ImageIcon(fileName);
    int x = 10;
    int y = 10;
    public Main(){
        setTitle("Gui3");
        this.getContentPane().setPreferredSize(new Dimension(1000,1000));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.toFront();
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1000,100));
        myCanvas = new Canvas();
        panel.add(myCanvas);
        
    }
    public void paint (Graphics g) {
        super.paint(g);
        image.paintIcon(this,g,x,y);
    
    }
    
    
}
