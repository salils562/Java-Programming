class Complex{
    int real;
    int imaginary;
    public Complex(int real,int imaginary){
     this.real=real;
     this.imaginary=imaginary;
    }
    public void addComplex(Complex c1,Complex c2){
        System.out.println("The sum of two complex numbers is "+(c1.real+c2.real)+" + "+(c1.imaginary+c2.imaginary)+"i");
    }
}
public class passingObjects {
    public static void main(String[] args){
     Complex f3=new Complex(4,3);
     f3.addComplex(new Complex(2,2),new Complex(2,8));
    }
}
