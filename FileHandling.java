package practice_project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class FileHandling
{
    public static void main(String args[]) throws FileNotFoundException, IOException {
        System.out.println("Select an operation ");
        System.out.println(" w for write ");
        System.out.println(" r for read ");
        System.out.println(" a for append ");
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("r"))
        {
            new FReading();
        }
        else if(s.equalsIgnoreCase("w")||s.equalsIgnoreCase("a"))
        {
            writingToFile(s);
            
            
        }
        else
        {
            System.out.println("Error");
        }
        
        
        sc.close();
        
    }
    
    public static void writingToFile(String s)
    {
        Scanner in=null;
        try
        {
            String source = "";
            File f=new File("D://GitHub//testFile1.txt");
            
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            FileWriter f0 =null;
            if(s.equalsIgnoreCase("w"))
            {
                f0 = new FileWriter(f,false);
                System.out.println("content overwrite");
                System.out.println("Type 'n' to exit");
                System.out.println("Type 'y' to contiue");
                in=new Scanner(System.in);
                String s1=in.nextLine();
                if(s1.equals("n"))
                System.exit(0);
                System.out.println("after writing Type 'stop' to finish ");
                f.delete();
                f.createNewFile();
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.write(source + System.getProperty("line.separator"));
                    
                }
                
                in.close();
            }
            else
            {  f0 = new FileWriter(f,true);
                System.out.println("after appending Write 'stop' to finish ");
                while(!(source=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.append(source+ System.getProperty("line.separator"));
                }
            }
            f0.close();
            
        }
        catch(Exception e){
            System.out.println("Error"
            		+ "" );
            e.printStackTrace();
        }
        
        
    }
    
}

class FReading {
    public static String str="";
    
    public FReading() {
        
        try{
            File f5=new File("D://GitHub//testFile1.txt");
            if(! f5.exists())
            f5.createNewFile();
            FileReader fl=new FileReader(f5);
            BufferedReader bf=new BufferedReader(fl);
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error" );
            e.printStackTrace();
        }
    }
}
