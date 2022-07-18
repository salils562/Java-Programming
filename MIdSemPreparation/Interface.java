interface Cars {
    void carName();

    void carModel();
}

interface Model {
    void carPic();
}

class Maruti implements Cars, Model {
    public void carName() {
        System.out.println("Hello world");
    }

    public void carModel() {
        System.out.println("Hello world");
    }

    public void carPic() {
        System.out.println("Hello world");
    }
}

public class Interface {
    public static void main(String[] args) {
      Maruti m=new Maruti();
      m.carModel();
      m.carPic();
      m.carName();
    }
}
