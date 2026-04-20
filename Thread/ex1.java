public class ex1{
    public static void main(String[] args) 
    {
        A ob = new A();
        ob.start();
        // for(int i=0;i<20;i++)
        // {
        //     System.out.println("Main "+i);
        // }
    }
}
class A extends Thread{
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("A "+i);
        }
    }
}