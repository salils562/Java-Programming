class Thread1 extends Thread{
    public Thread1(String name){
        super(name);
    }
    public void run(){
        System.out.println("This is class Thread");
    }
}

public class ThreadConstructor {
    public static void main(String[] args){
        Thread1 th=new Thread1("salil");
        th.start();
        System.out.println("The name of the thread is "+th.getName());
        System.out.println("The Id of the thread is "+th.getId());
    }
}
