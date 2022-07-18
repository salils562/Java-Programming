class Priority extends Thread{
public void run(){
    int j=1;
    while(j<100){
        System.out.println("This is normal");
        j++;
    }
}
}
class Priority2 implements Runnable{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("This is runnable");
            i++;
        }
    }
}
public class Question_7 {
public static void main(String[] args){
    Priority p=new Priority();
    Priority2 p2=new Priority2();
    Thread th=new Thread(p2);
    th.setPriority(Thread.MAX_PRIORITY);
    p.setPriority(Thread.MIN_PRIORITY);
    p.start();
    th.start();
    System.out.println("The priority of the 1st thread is "+p.getPriority());
    System.out.println("The priority of the 2nd thread is "+th.getPriority());
}
    
}
