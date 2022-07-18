interface employee{
public void setName(String n);
}
interface salary{
public void setSalary(int sal);
}
class company implements employee,salary{
    private String name;
    private int sal;
    public void setName(String name){
    this.name=name;
    }
    public void setSalary(int sal){
     this.sal=sal;
    }
    public void showData(){
        System.out.println("The name of the employee is "+name+"\n"+"salary is "+sal);
    }
}
public class practicingInstance{
    public static void main(String[] args){
    company salil=new company();
    salil.setName("salil sharma");
    salil.setSalary(800000);
    salil.showData();
    }
}