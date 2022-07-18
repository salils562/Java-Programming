import java.awt.*;
import java.awt.event.*;
public class Moving {
    Frame fr=new Frame("Moving Rect");
    int snakeX=30;
    int snakeY=30;
    public Moving(){
        int snakeSize=30;
        fr.addKeyListener(new KeyAdapter(){
         @Override
         public void keyPressed(KeyEvent e){
            int code=e.getKeyCode();
            if(code==37){
                Graphics g=fr.getGraphics();
                g.drawRect(snakeX, snakeY, snakeSize, snakeSize);
                snakeX-=10;
                snakeY+=0;
            }
            else if(code==39){
                Graphics g=fr.getGraphics();
                g.drawRect(snakeX, snakeY, snakeSize, snakeSize);
                snakeX+=10;
                snakeY+=0;
            }
            else if(code==38){
                Graphics g=fr.getGraphics();
                g.drawRect(snakeX, snakeY, snakeSize, snakeSize);
                snakeX+=0;
                snakeY-=10;
            }
            else if(code==40){
                Graphics g=fr.getGraphics();
                g.drawRect(snakeX, snakeY, snakeSize, snakeSize);
                snakeX+=0;
                snakeY+=10;
            }
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
      Moving move=new Moving();
    }
}
