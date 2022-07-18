class Complex{
    int real,imaginary;
    int sumReal,sumImagi;
    public void setData(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void addTwoNumbers(Complex c1,Complex c2){
        sumReal=c1.real+c2.real;
        sumImagi=c1.imaginary+c2.imaginary;
    }
    public void showComplex(){
        System.out.println(sumReal+"+"+sumImagi+"i");
    }
}
public class PassingObjects {
    public static void main(String[] args){
     Complex c1=new Complex();
     Complex c2=new Complex();
     c1.setData(4, 6);
     c2.setData(5, 2);
     Complex c3=new Complex();
     c3.addTwoNumbers(c1, c2);
     c3.showComplex();
    }
}
