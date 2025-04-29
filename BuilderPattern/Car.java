
import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;

public class Car {
    private int numberOfWheels;
    private SeatBelt seatBelt;
    private String color;
    private Windscreen windscreen;
    private Engine engine;

    public Car(int numberOfWheels,
               SeatBelt seatBelt,
               String color,
               Windscreen windscreen,
               Engine engine) {
        this.numberOfWheels = numberOfWheels;
        this.seatBelt = seatBelt;
        this.color = color;
        this.windscreen = windscreen;
        this.engine = engine;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public SeatBelt getSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(SeatBelt seatBelt) {
        this.seatBelt = seatBelt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Number of wheels:\t " + numberOfWheels + "\n" +
                "Brand of seat belts:\t " + seatBelt.getBrand() + "\n" +
                "Color:\t\t\t " + color + "\n" +
                "Windscreen brand:\t " + windscreen.getName() + "\n" +
                "Engine:\t\t\t " + engine.getName();
    }
}