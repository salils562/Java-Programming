// Print hello and good morning using threads
class Th extends Thread{
    private String name;
    public Th(String name){
        this.name=name;
    }
    public void run(){
        int i=1;
        while(i<100){
        System.out.println(name);
        i++;
    }
}
}
public class Question_5{
    public static void main(String[] args){
      Th t1=new Th("Good morning");
      Th t2=new Th("Welcome");
      t1.start();
      t2.start();
    }
}