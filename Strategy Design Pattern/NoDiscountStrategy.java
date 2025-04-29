public class NoDiscountStrategy implements IPromoteStrategy {
    @Override
    public double doDiscount(double price) {
        return price ;
    }
}