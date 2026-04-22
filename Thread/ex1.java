public class ex1{
    public static void main(String[] args) 
    {

        A ob = new A();
        B ob1 = new B();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob1);

        t1.start();
        t2.start();


        // ob.start();

        // ob1.start();



        System.out.println("main thread");
    }
}
// class A extends Thread{
//     public void run()
//     {
//         for(int i=0;i<20;i++)
//         {
//             System.out.println("A "+i);
//         }
//     }
// }
// class B extends Thread{
//     public void run()
//     {
//         for(int i=0;i<20;i++)
//         {
//             System.out.println("B "+i);
//         }
//     }
// }

// class A implements Runnable{
//     public void run()
//     {
//         for(int i=0;i<20;i++)
//         {
//             System.out.println("A "+i);
//         }
//     }
// }

// class B implements Runnable{
//     public void run()
//     {
//         for(int i=0;i<20;i++)
//         {
//             System.out.println("B "+i);
//         }
//     }
// }


