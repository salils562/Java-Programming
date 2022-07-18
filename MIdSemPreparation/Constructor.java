class Employee{
    private int data;
    private String name;
    Employee(){
        System.out.println("Hello this is emp");
    }
    Employee(String a,int b){
     name=a;
     data=b;
    }
    public void showData(){
        System.out.println("The name of the employee is "+name+" data is "+data);
    }
}
public class Constructor{
    public static void main(String[] args){
     Employee e=new Employee("salil sharma",5);
     e.showData();
    }
}