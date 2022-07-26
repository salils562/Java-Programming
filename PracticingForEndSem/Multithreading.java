class T1 implements Runnable{
    String name;
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Hi i am in "+name);
            i++;
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        T1 th=new T1();
        T1 th2=new T1();
        Thread thread1=new Thread(th);
        Thread thread2=new Thread(th2);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        th.name=thread1.getName();
        th2.name=thread2.getName();
        thread1.start();
        thread2.start();
    }
}