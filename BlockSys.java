//static - dealing with classes not objects
//synchronized - dealing with objects not classes

class Bank extends Thread {

    static int withdraw;
    static int balance = 5000;

    Bank(int a) {
        withdraw = a;
    }

    public void run() {
        synchronized (this) {
            nagpur();
        }
    }

    static void nagpur() {
        String name = Thread.currentThread().getName();
        if (balance >= withdraw) {
            System.out.println("--------Withdrawal successful! " + Thread.currentThread().getName() + " has withdrawn "
                    + withdraw + " units.");
            balance -= withdraw;
        } else {
            System.out.println("-------" + Thread.currentThread().getName() + " Sorry, insufficient balance.");
            System.out.println("-------" + Thread.currentThread().getName() + " Available balance is: " + balance);
        }
        System.out.println("Bye " + Thread.currentThread().getName());
    }

}

public class BlockSys extends Thread {

    public static void main(String args[]) {

        Bank op1 = new Bank(2000);

        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op1);

        Bank op2 = new Bank(2000);
        Thread t3 = new Thread(op2);
        Thread t4 = new Thread(op2);

        t1.setName("Sanket");
        t2.setName("Amit");
        t3.setName("Rahul");
        t4.setName("Vikram");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
