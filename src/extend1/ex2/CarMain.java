package extend1.ex2;

import extend1.ex2.ElectricCar;
import extend1.ex2.GasCar;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
