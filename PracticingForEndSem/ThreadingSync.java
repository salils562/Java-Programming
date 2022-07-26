import java.io.IOException;
class PrintTriangle{
   synchronized void print(char ch){
    int i=0;
    while(i<10){
        int j=0;
        while(j<=i){
            System.out.print(ch);
            j++;
        }
        System.out.print("\n");
        i++;
    }
      
    
}
}
class Threading extends Thread{
    PrintTriangle tr;
    char ch;
    public Threading(PrintTriangle tr,char ch){
    this.ch=ch;
    this.tr=tr;
    }
    public void run(){
    tr.print(ch);
    }
}
public class ThreadingSync {
public static void main(String[] args){
PrintTriangle tr=new PrintTriangle();
PrintTriangle tr1=new PrintTriangle();
Threading t=new Threading(tr,'*');
Threading t1=new Threading(tr1,'#');
t.start();
t1.start();

}    
}
