class Employee{
    public void setName(String name){
        System.out.println(name);
    }
}
public class passingInterface{
    public static void callName(Employee e,String n){
        e.setName(n);
    }
    public static void main(String[] args){
        callName(new Employee(){
            @Override
            public void setName(String name) {
                System.out.println("my name is "+name);
            }
        }, "salil sharma");
    }
    
}