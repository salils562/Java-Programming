import java.io.*;
import java.util.*;
public class FileReading{
    public static void main(String[] args){
        File f=new File("C:\\Users\\salil\\OneDrive\\Desktop\\salil.txt");
        f.delete();
        // Reading a file
       /*  String data="";
        try{
         File f=new File("C:\\Users\\salil\\OneDrive\\Desktop\\salil.txt");
         Scanner scanner=new Scanner(f);
         System.out.println("READING A FILE");
         while(scanner.hasNextLine()){
             data+=scanner.nextLine();
             data+="\n";
            }
            System.out.println(data);
         System.out.println("\n\n");
         }
         catch(IOException e){
             e.getStackTrace();
         } 

         Scanner s=new Scanner(System.in);
         System.out.println("Enter what to change?");
         String change;
         change=s.nextLine();
         System.out.println("With what: ");
         String with;
         with=s.nextLine();
         data=data.replaceAll(change, with);
         // Writing in a file
         try{
         FileWriter fr=new FileWriter("C:\\Users\\salil\\OneDrive\\Desktop\\salil.txt");
         fr.write(data);
         fr.close();
         }
         catch(IOException e){
            e.getStackTrace();
         }
       */
      
    }
}