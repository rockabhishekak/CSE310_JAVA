// Create a class with static bankName and instance balance. Show how changing bankName affects all objects.
class Bank{
    public static void main(String[] args)
    {
        BankAccount obj1 = new BankAccount(1000.0);
        obj1.display();
        BankAccount obj2 = new BankAccount(2000.0);
        obj2.display();

    }
}
class BankAccount {

    static String bankName = "Global Bank";
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Bank Name: " + bankName + " | Balance: " + balance);
    }
}