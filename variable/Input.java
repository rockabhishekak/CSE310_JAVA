import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String name = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println("You entered: " + num + " and your name is: " + name + " and character is: " + ch);
        sc.close();
    }
}
