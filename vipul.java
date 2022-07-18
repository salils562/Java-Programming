import java.awt.*;
import java.awt.event.*;

public class vipul {
  
 public static void main(String[] args){
   Frame fr=new Frame("Two number calculator");
   Label l1=new Label("Enter 1st number");
   TextField t1=new TextField(10);
   Label l2=new Label("Enter 2nd number");
   TextField t2=new TextField(10);
   Label l3=new Label("The sum of two numbers is ");
   TextField t3=new TextField(10);
   Button button=new Button("ADD");

   fr.add(l1);
   fr.add(t1);
   fr.add(l2);
   fr.add(t2);
   fr.add(l3);
   fr.add(t3);
   fr.add(button);
   button.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
       int a=Integer.parseInt(t1.getText());
       int b=Integer.parseInt(t2.getText());
       int c=a+b;
       t3.setText(Integer.toString(c));
       
    }
   });
   





   // frame setter
   fr.setSize(500,500);
   fr.setLayout(new FlowLayout());
   fr.setVisible(true);
   fr.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        fr.dispose();
    }
});
 }   
}