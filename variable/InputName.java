import java.util.Scanner;
public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your name: ");
        sc.nextLine(); // Consume the newline character left by nextInt()
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        sc.close();
    }
}
