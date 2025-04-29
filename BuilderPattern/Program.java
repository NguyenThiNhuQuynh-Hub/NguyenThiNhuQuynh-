import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class Program {
    public static void main(String[] args) {
        Car car = new Car(4,
                new SeatBelt("nhà Quỳnh Quỳnh làm"),
                "đỏ",
                new Windscreen("kinh cường  lực "),
                new Engine("4 bánh"));

        Car carByBuilder = new CarBuilder()
                .addWheels(4)
                .addSeatBelts(new SeatBelt("Quỳnh Quỳnh Seat Belt"))
                .addWindscreen(new Windscreen("Quỳnh Quỳnh wind screen"))
                .addEngine(new Engine("Quỳnh Quỳnh 4 bánh"))
                .paint("đỏ")
                .build();

        System.out.println(car.toString());
        System.out.println("------------------------------------");
        System.out.println(carByBuilder.toString());
    }
}
