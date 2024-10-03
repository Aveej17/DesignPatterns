package abstractFactoryDesignPattern;

public class PublicUniversityFactory extends UniversityFactory{
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch (course){
            case "math":
                return new ASUAdmitCard();
            case "physics":
                return new USCAdmitCard();
            case "cs":
                return new VSUAdmitCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String course) {

        switch (course){
            case "math":
                return new ASUFeeCalculator();
            case "physics":
                return new USCFeeCalculator();
            case "cs":
                return new VSUFeeCalculator();
            default:
                break;
        }
        return null;
    }
}
