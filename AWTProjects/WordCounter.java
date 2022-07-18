import java.awt.*;
import java.awt.event.*;
public class WordCounter {
    Frame fr=new Frame();
    TextField text=new TextField();
    Label l1=new Label();
    int words=0;    
    public WordCounter(){
    l1.setBounds(100,100,10,10);
    text.setBounds(50,150,400,100);
    fr.add(text);
    fr.add(l1);
    fr.setSize(500,500);
    fr.setVisible(true);
    fr.setLayout(null);
    text.addKeyListener(new KeyAdapter(){
        @Override
        public void keyPressed(KeyEvent e){
         
         if(e.getKeyCode()==8){
            words-=1;
            String word= words + " Words ";
            l1.setText(word);
         }
         else{   
         words+=1;
         String word= words + " Words ";
         l1.setText(word);
         }
        }
    });
    fr.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            fr.dispose();
        }
    });
    }
    public static void main(String[] args) {
        WordCounter word=new WordCounter();
    }
}
