class Gun extends Thread{
public void run(){
    int i=1;
    while(i<100){
        System.out.println("This is 1st class");
        i++;
    }
}
}
class Gun2 extends Thread{
public void run(){
    int i=1;
    while(i<100){
        System.out.println("This is 2nd class");
        i++;
    }
}
}
public class ThreadClass {
    public static void main(String[] args){
        Gun t1=new Gun();
        Gun2 t2=new Gun2();
        t1.start();
        t2.start();
    }
}
