class Employee{
String name;
float salary;
int data;
public void setDetails(String name,float salary,int data){
    this.name=name;
    this.salary=salary;
    this.data=data;
}
public void showDetails(){
    System.out.println("The name of the employee is "+name);
    System.out.println("The data of the employee is "+data);
    System.out.println("The salary of the employee is "+salary);
}
}
public class Classes {
    public static void main(String[] args){
        Employee salil=new Employee();
        salil.setDetails("salil",323, 3);
        salil.showDetails();
         
    }
}
