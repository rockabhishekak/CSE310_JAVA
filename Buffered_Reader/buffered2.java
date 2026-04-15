import java.io.FileWriter;
import java.io.BufferedWriter;

public class buffered2 {
    public static void main(String[] args)
    {
        try{
        //    FileWriter fw = new FileWriter("a.txt", true);
        //    BufferedWriter bw = new BufferedWriter(fw);
            BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt", true));
           String s = "Hello World with buffered writer";
           bw.write(s);
           System.out.println(s);
           bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
    }
}
