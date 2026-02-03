import java.util.Scanner;
class Fibonaci{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        for(int i = 0; i<number; i++)
        {
            System.out.println(f1);
            int result = f1+f2;
            f1=f2;
            f2=result;
        }

    }
}