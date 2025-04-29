public class HalfDiscountStrategy implements IPromoteStrategy {
    @Override
    public double doDiscount(double price) {
        return price * 0.5;
    }
}