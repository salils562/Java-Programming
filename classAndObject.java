class Employee{
private String Name;
private int Data;
public Employee(String Name,int Data){
    this.Name=Name;
    this.Data=Data;
}
public void showData(){
System.out.println("The name of the employee is "+Name);
System.out.println("The ID of the employee is "+Data);
}
}
public class classAndObject {
    public static void main(String[] args) {
        String name="Salil sharma";
        int id=4;
        Employee salil=new Employee(name,id);
        salil.showData();
    }
}
