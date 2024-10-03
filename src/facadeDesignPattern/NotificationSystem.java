package facadeDesignPattern;

public class NotificationSystem {

    public void sendMail(User user, int ticketNumber){
        System.out.println("Sent email to "+user.name +" on "+user.email+" for ticket No : "+ticketNumber);
    }

    public void sendSms(User user, int ticketNumber){
        System.out.println("Sent sms to "+user.name +" on "+user.phoneNO+" for ticket No : "+ticketNumber);
    }

}
