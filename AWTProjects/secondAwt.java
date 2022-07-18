import java.awt.*;
import java.awt.event.*;
public class secondAwt extends Frame{
    TextField text=new TextField();
    Button button=new Button("Click me");
    public secondAwt(){
    text.setBounds(50,50,50,20);
    text.setEditable(true);
    text.setBackground(Color.black);
    text.setForeground(Color.white);
    
    add(text);    
    setSize(500,400);
    setVisible(true);
    setLayout(null);
   
    }
    public static void main(String[] args){
    new secondAwt();
    }
}
