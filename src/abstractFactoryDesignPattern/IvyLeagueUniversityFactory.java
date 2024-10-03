package abstractFactoryDesignPattern;

public class IvyLeagueUniversityFactory extends UniversityFactory{
    @Override
    public AdmitCard getAdmitCard(String course) {

        switch (course){
            case "math":
                return new MitAdmitCard();
            case "physics":
                return new CalTechAdmitCard();
            case "cs":
                return new GeorgiaTechAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {
        switch (course){
            case "math":
                return new MitFeeCalculator();
            case "physics":
                return new CalTechFeeCalculator();
            case "cs":
                return new GeorgiaTechFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
