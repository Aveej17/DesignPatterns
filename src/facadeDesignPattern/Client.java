package facadeDesignPattern;

public class Client {
    public static void main(String[] args) {

//        client does all the work

        User user = new User("Jeeva", "jeeva@email.com", 1234567890);

//        TicketSystem ts = new TicketSystem();
//        boolean isBookingAvailable = ts.validateAvailability("Movie");
//        if(isBookingAvailable){
//            ts.createTicket(100, user, "movie");
//
//            PaymentSystem ps = new PaymentSystem();
//            ps.chargeCard();
//
//            NotificationSystem ns = new NotificationSystem();
//            ns.sendMail(user, ts.getTicketNumber());
//            ns.sendSms(user, ts.getTicketNumber());
//        }


        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.createBooking(user);
    }
}
