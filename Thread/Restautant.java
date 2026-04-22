public class Restautant {
    public static void main(String[] args) {
        RRestautant ob = new RRestautant();
        Thread t1 = new Thread(() -> {
            ob.creatOrder();
        });
        Thread t2 = new Thread(() -> {
            ob.cashier();
        });
        Thread t3 = new Thread(() -> {
            ob.chef();
        });
        Thread t4 = new Thread(() -> {
            ob.eating();
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }
    }

}

class RRestautant {
    boolean available = false;
    boolean eaten = false;
    boolean order = false;

    synchronized void creatOrder() {
        order = true;
        notifyAll();
    }

    synchronized void eating() {
        try {
            while (!available) {
                System.out.println("food is not prepared....Waiting");
                wait();
            }
            System.out.println("eating food...");
            eaten = true;
            notifyAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Eating interrupted");
        }
    }

    synchronized void cashier() {
        try {
            while (!eaten) {
                System.out.println("not enten.... waiting to eat");
                wait();
            }
            System.out.println("bill paid");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Cashier interrupted");
        }
    }

    synchronized void chef() {
        try {
            while (!order) {
                System.out.println("no customers...");
                wait();
            }
            System.out.println("food prepared...");
            available = true;
            notifyAll();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Chef interrupted");
        }
    }

}