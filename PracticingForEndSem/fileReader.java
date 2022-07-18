import java.io.File;
import java.util.Scanner;
import java.io.*;
public class fileReader {
    public static void main(String[] args){
    try{
        File file=new File("salil.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
       
        // FileWriter fileWriter=new FileWriter("salil.txt");
        // fileWriter.write("hi salil sharma I know you are a good boy");
        // fileWriter.close();
        // file.createNewFile();
    }
    catch(IOException e){
        e.printStackTrace();
    }

    }
}
