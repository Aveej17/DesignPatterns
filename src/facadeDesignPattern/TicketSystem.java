package facadeDesignPattern;

public class TicketSystem {

    private Integer ticketNumber;
    public boolean validateAvailability(String str){
        return true;
    }
    public void createTicket(int ticketNumber, User user, String movie){
        this.ticketNumber = ticketNumber;
        System.out.println("Ticket Created for a movie");
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }
}
