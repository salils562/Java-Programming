class Thread1 implements Runnable{
public void run(){
int i=0;
while(i<100){
    System.out.println("This is Thread no 1");
    i++;
}
}
}
class Thread2 implements Runnable{
    public void run(){
    int jk=0;
    while(jk<100){
        System.out.println("This is Thread no 2");
        jk++;
    }
    }
}
public class Threading {
    public static void main(String[] args){
     Thread1 t=new Thread1();
     Thread2 t2=new Thread2();
     Thread s=new Thread(t);
     Thread s2=new Thread(t2);
     s.setPriority(Thread.MAX_PRIORITY);
     s2.setPriority(Thread.MIN_PRIORITY);
     s.start();
     s2.start();
    }
}
