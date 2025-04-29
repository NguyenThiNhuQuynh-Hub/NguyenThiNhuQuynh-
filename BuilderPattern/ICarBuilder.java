

import CarParts.Engine;
import CarParts.SeatBelt;
import CarParts.Windscreen;


interface ICarBuilder {
    ICarBuilder addWheels(int numberOfWheels);
    ICarBuilder addSeatBelts(SeatBelt seatBelt);
    ICarBuilder paint(String color);
    ICarBuilder addWindscreen(Windscreen windscreen);
    ICarBuilder addEngine(Engine engine);
    Car build();
}