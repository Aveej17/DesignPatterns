package facadeDesignPattern;

public class BookingFacade {
    public void createBooking(User user) {
        TicketSystem ts = new TicketSystem();
        PaymentSystem ps = new PaymentSystem();
        NotificationSystem ns = new NotificationSystem();
        boolean isBookingAvailable = ts.validateAvailability("Movie");
        if (isBookingAvailable) {
            ts.createTicket(100, user, "movie");


            ps.chargeCard();


            ns.sendMail(user, ts.getTicketNumber());
            ns.sendSms(user, ts.getTicketNumber());
        }
    }
}
