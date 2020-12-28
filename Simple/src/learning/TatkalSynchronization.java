package learning;

public class TatkalSynchronization {

    int numOfSeats ;

    TatkalSynchronization(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }

    synchronized void bookTickets() {
        System.out.println("No of tickets" + numOfSeats);
        if(numOfSeats == 0){
            System.out.println("Ticket not available --- booking not success");
        } else {
            System.out.println("Booking successful");
            numOfSeats = numOfSeats - 1;
        }
        System.out.println("Available tickets" + numOfSeats);

    }
}

class Passenger extends Thread{
    TatkalSynchronization tatkalSynchronization ;

    Passenger(TatkalSynchronization tatkalSynchronization){
        this.tatkalSynchronization = tatkalSynchronization;
    }

    public static void main(String[] args) {
        TatkalSynchronization t = new TatkalSynchronization(1);
        String passengerName;
        Passenger p1 = new Passenger(t);
        Passenger p2 = new Passenger(t);
        p1.start();
        p2.start();
    }
    public void run() {
        tatkalSynchronization.bookTickets();
    }


}
