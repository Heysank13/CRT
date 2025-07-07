//block sync
import java.lang.Thread;


class Block{
    int availableSeats = 10;

    void book(int seats){
        System.out.println("Hello, " + Thread.currentThread().getName());
        System.out.println("Hello, " + Thread.currentThread().getName());
        System.out.println("Hello, "  + Thread.currentThread().getName());

        synchronized(this){
            String name = Thread.currentThread().getName();
        if (availableSeats >= seats) {
            System.out.println("--------Booking successful! "+name+" has booked " + seats + " seats.");
            availableSeats-= seats;
        } else {
            System.out.println("-------"+name+" Sorry, seats are not available.");
            System.out.println("-------"+name+" Available seats are: " + availableSeats);
        }
        }

        System.out.println("Bye " + Thread.currentThread().getName());
        System.out.println("Bye " + Thread.currentThread().getName()); 
        System.out.println("Bye " + Thread.currentThread().getName());

    }

}

public class Kpmg extends Thread {

    static Block op;
    int seats;

    public void run(){
        op.book(seats);

    }

    

    public static void main(String args[]){

        op = new Block();

        Kpmg t1 = new Kpmg();
        Kpmg t2 = new Kpmg();

        t1.setName("Sanket");
        t2.setName("Amit");
        t1.seats = 7;
        t2.seats = 7;
        t1.start();
        t2.start();


    }
    
}

