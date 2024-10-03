package abstractFactoryDesignPattern;

public class USCFeeCalculator extends FeeCalculator{
    @Override
    public int calculateFee() {
        return 600;
    }
}
