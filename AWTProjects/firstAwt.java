import java.awt.*;
import java.awt.event.*;
class frame {
    Frame fr = new Frame("java frame");
    int width = 555;
    int height = 333;
    // Components
    Label name = new Label("Enter your name");
    TextField name1=new TextField();
    Label password = new Label("Enter your password");
    TextField pass=new TextField();
    Button b=new Button("Submit");
    public frame()
    {
        fr.setBackground(Color.green);
        name.setBounds(38,38,158,38);
        name1.setBounds(38,55,158,50);
        password.setBounds(38,102,158,38);
        pass.setBounds(38,110,158,50);
        b.setBounds(69,200,70,30);
        name.setForeground(Color.red);
        name1.setEditable(true);
        name1.setText("Enter your name");
        pass.setEditable(true);
        password.setForeground(Color.red);
        b.setBackground(Color.yellow);
        fr.add(b);
        fr.add(password);
        fr.add(pass);
        fr.add(name);
        fr.add(name1);
        fr.setSize(width, height);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fr.dispose();
            }
        });
          
    }
    

}

public class firstAwt {
    public static void main(String[] args) {
        frame f = new frame();
        f.b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            f.fr.setBackground(Color.black);
            }
        });
    }
}