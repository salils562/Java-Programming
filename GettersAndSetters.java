import java.util.Scanner;
class Employee{
    private String name;
    private int data;
    public void setData(String name,int id){
        this.name=name;
        this.data=id;
    }
    public void showData(){
        System.out.println("The name of the Employee is "+name);
        System.out.println("The id of the Employee is "+data);
    }
}
public class GettersAndSetters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee salil=new Employee();
        String name;
        int id;
        System.out.println("Enter the name and id of the employee");
        name=sc.nextLine();
        id=sc.nextInt();
        salil.setData(name, id);
        salil.showData();
    }
}
