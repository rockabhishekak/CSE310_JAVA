// The Banker: Use a do-while loop to create a banking menu (Deposit, Withdraw, Check
// Balance, Exit). Keep the program running until the user chooses "Exit"
import java.util.Scanner;
class Atm{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c;
        double Bal=0;

        do{
            System.out.println("\n--- ATM MENU ---");
            System.out.println("Select 1 for Deposit");
            System.out.println("Select 2 for Withdraw");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 for Exit");
            System.out.print("Enter your choice: ");
            c = sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Enter the Deposit ammount: ");
                    double nn =sc.nextInt();
                    Bal =  Bal + nn;
                    System.out.println("Amount Deposit succesfully");
                    break;
                case 2:
                    System.out.print("Enter the Withdraw ammount: ");
                    double wi =sc.nextInt();
                    if(Bal>=wi)
                    {

                        Bal =  Bal - wi;
                        System.out.println("Amount withraw succesfully");
                        
                    }
                    else
                    {
                        System.out.println("You have not enough balance try again.");
                    }
                    break;
                case 3:
                    System.out.println("Balance : "+Bal);
                    break;
                case 4:
                    System.out.println("Thank Q..");
                    break;
                default:
                    System.out.println("Enter Valid option.");
            }

        }
        while(c!=4);
    }
}