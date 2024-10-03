package abstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        int myScore = 120;
        UniversityFactory u = UniversityFactory.getUniversity(myScore);

        AdmitCard admitCard = u.getAdmitCard("math");
        FeeCalculator feeCalculator = u.getFeeCalculator("math");
        System.out.println(admitCard.getClass());
        System.out.println(feeCalculator.calculateFee());

        System.out.println();

        int hisScore = 100;

        UniversityFactory u1 = UniversityFactory.getUniversity(hisScore);
        AdmitCard admitCard1 = u1.getAdmitCard("math");
        FeeCalculator feeCalculator1 = u1.getFeeCalculator("math");
        System.out.println(admitCard1.getClass());
        System.out.println(feeCalculator1.calculateFee());

    }
}
