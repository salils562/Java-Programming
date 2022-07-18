import java.awt.*;
import java.awt.event.*;
class Theme extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
    fr.dispose();
    }
    Frame fr=new Frame("Swapping");
    Button button=new Button("Swap");
    TextField t1=new TextField();
    TextField t2=new TextField();
    public Theme(){
        t1.setBounds(30,50,100,30);
        t2.setBounds(30,100,100,30);
        button.setBounds(30,150,100,30);
    fr.add(t1);
    fr.add(t2);
    fr.add(button);
    fr.addWindowListener(this);
    fr.setBackground(Color.black);
    
    button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
         String s1=t1.getText();
         String s2=t2.getText();
         String temp;
         temp=s1;
         s1=s2;
         s2=temp;
         t1.setText(s1);
         t2.setText(s2);
        }
    });
        
    // Setting componenets  
     fr.setSize(500,500);
     fr.setLayout(null);
     fr.setVisible(true);
    }
    
}
public class swapping{
    public static void main(String[] args){
     Theme th=new Theme();
    }
}
