class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("Bite");
    }
}
class Human extends Monkey{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class Quesiton_2 {
    public static void main(String[] args) {
        Human salil=new Human();
        salil.bite();
        salil.eat();
        salil.jump();
        salil.sleep();
    }
}
