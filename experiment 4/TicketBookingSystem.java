import java.util.concurrent.PriorityBlockingQueue;

class TicketBooking implements Runnable {
    private static int availableSeats = 10;
    private final String customer;
    private final int priority;

    public TicketBooking(String customer, int priority) {
        this.customer = customer;
        this.priority = priority;
    }

    public synchronized void bookSeat() {
        if (availableSeats > 0) {
            System.out.println(customer + " booked a seat. Remaining seats: " + (--availableSeats));
        } else {
            System.out.println(customer + " failed to book. No seats left.");
        }
    }

    @Override
    public void run() {
        bookSeat();
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        PriorityBlockingQueue<TicketBooking> queue = new PriorityBlockingQueue<>(10, (a, b) -> Integer.compare(b.priority, a.priority));

        queue.add(new TicketBooking("VIP_1", 10));
        queue.add(new TicketBooking("Regular_1", 5));
        queue.add(new TicketBooking("VIP_2", 10));
        queue.add(new TicketBooking("Regular_2", 5));

        while (!queue.isEmpty()) {
            new Thread(queue.poll()).start();
        }
    }
}
