
public class Ticket {
    private IPromoteStrategy promoteStrategy;
    private double price;
    private String name;

    public IPromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket() {
    }

    public Ticket(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public double getPromotedPrice() {
        if (promoteStrategy != null) {
            return promoteStrategy.doDiscount(price);
        }
        return price; // Nếu không có strategy, trả lại giá gốc
    }
}
