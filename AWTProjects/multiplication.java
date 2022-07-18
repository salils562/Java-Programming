import java.awt.*;
import java.awt.event.*;
public class multiplication{
    
    public static void main(String[] args){
     Frame fr=new Frame("Multiplication");
     TextField t1=new TextField("Enter number");
     Label ans=new Label();
     ans.setBounds(30,200,150,250);
     ans.setBackground(Color.red);
     ans.setForeground(Color.white);
     Button button=new Button("Calculate");
     t1.setBounds(30,50,150,30);
     button.setBounds(30,100,70,25);
     t1.setBackground(Color.GREEN);
     fr.add(t1);
     fr.add(button);
     fr.add(ans);
     button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           int val=Integer.parseInt(t1.getText());
           String s="";
           for(int i=1;i<11;i++){
           s+= val+" x "+i+" = "+(val*i)+"\n";
        }
        ans.setText(s);
          
           
        }
     }); 
     // frame setters
     fr.setSize(500,500);
     fr.setLayout(null);
     fr.setVisible(true);
     fr.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e) {
          fr.dispose();
        }
     });
    }
    
}