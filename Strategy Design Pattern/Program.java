import java.util.Random;

public class Program {
    public static void main(String[] args) {
        System.out.println("Bắt đầu lấy vé!");

        Random random = new Random();

        for (int i = 1; i <= 2; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50d * i);
            generatePromoteStrategy(random, ticket);
            logTicketDetails(ticket);

            generatePromoteStrategy(random, ticket);
            logTicketDetails(ticket);
        }
    }

    private static void logTicketDetails(Ticket ticket) {
        System.out.println(
                "Giá khuyến mãi của " +
                        ticket.getName() +
                        " là " +
                        ticket.getPromotedPrice() +
                        " " +
                        ticket.getPromoteStrategy().getClass().getSimpleName() +
                        "\n");
    }

    private static void generatePromoteStrategy(Random random, Ticket ticket) {
        int strategyIndex = random.nextInt(4);
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
            case 2:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
            default:
                ticket.setPromoteStrategy(new EightyDiscountStrategy());
                break;
        }
    }
}