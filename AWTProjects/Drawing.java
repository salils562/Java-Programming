import java.awt.*;
import java.awt.event.*;
public class Drawing{
    Frame fr=new Frame("Create Drawing");
    public Drawing(){
        int size=20;
        fr.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
             Graphics g = fr.getGraphics();
             g.setColor(Color.blue);
             g.drawOval(e.getX(), e.getY(), size, size);
            }
        });
        fr.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                fr.dispose();
            }
        });
        fr.setSize(500,500);
        fr.setVisible(true);
        fr.setLayout(null);
    }
    public static void main(String[] args){
      Drawing draw=new Drawing();
    }
}