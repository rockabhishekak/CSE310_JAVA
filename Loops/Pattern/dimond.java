import java.util.Scanner;
class dimond{
    public static void main(String[] args)
    {
        //  n = 3
        //    *
        //   ***
        //  *****
        //   ***
        //    *

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    


        for(int i=n-1;i>=1;i--)
        {
            for(int k=n-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            System.out.println("");
            
        }


    }
}