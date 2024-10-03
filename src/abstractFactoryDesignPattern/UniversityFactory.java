package abstractFactoryDesignPattern;

public abstract class UniversityFactory {

    private static int cutoff = 105;

    public static UniversityFactory getUniversity(int score){
        if(score>cutoff){
            return new IvyLeagueUniversityFactory();
        }
        else {
            return new PublicUniversityFactory();
        }
    }

    public abstract  AdmitCard getAdmitCard(String course);
    public abstract  FeeCalculator getFeeCalculator(String course);

}
