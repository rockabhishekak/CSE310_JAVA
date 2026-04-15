import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Buffered {
    public static void main(String[] args)
    {
        try{
            stud s = new stud();
            // FileOutputStream fos = new FileOutputStream("b.txt");
            // ObjectOutputStream oos = new ObjectOutputStream(fos);
            //     oos.writeObject(s);

            // String s = "Hello World";
            // fos.write(s.getBytes());
            // fos.close();
            FileInputStream fis = new FileInputStream("b.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // System.out.print((char)fis.read());
            // int data;
            
            // while((data = fis.read()) !=-1)
            // {
            //     fos.write(data);
            // }


            stud newob = (stud)ois.readObject();
            System.out.println(newob.name);
            System.out.println(newob.id);
            System.out.println(newob.age);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
    }
}


class stud implements Serializable
{
    int id = 101;
    String name = "Rohit";
    transient int age = 22;
    
}