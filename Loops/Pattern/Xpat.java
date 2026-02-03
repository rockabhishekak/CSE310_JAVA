import java.util.Scanner;
class Xpat{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0 ; j<n ;j++)
            {
                if(i==j || j==i)
                {
                    System.out.print("* ");
                }
                else if(i+j==n-1)
                {
                    System.out.print("* ");

                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }


    }
}