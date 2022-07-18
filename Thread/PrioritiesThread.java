class Thread1 extends Thread{
    public Thread1(String name){
        super(name);
    }
    public void run(){
        int i=1;
        while(i<100){
            System.out.println("Hello this is "+this.getName());
            i++;
        }
    }
}
public class PrioritiesThread {
    public static void main(String[] args){
        Thread1 th=new Thread1("salil");
        Thread1 th1=new Thread1("salil-1");
        Thread1 th2=new Thread1("salil-2");
        Thread1 th3=new Thread1("salil-Most Important");
        th3.setPriority(Thread.MAX_PRIORITY);
        th.setPriority(Thread.MIN_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th.start();
        th1.start();
        th2.start();
        th3.start();
    }
}
