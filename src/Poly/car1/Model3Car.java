package Poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car.pressAccelerator");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}

