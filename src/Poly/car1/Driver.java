package Poly.car1;

import java.sql.SQLOutput;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차 설정 : " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차 운전");
        car.offEngine();
        car.startEngine();
        car.pressAccelerator();
    }
}
