package Poly.ex4;

public class Caw implements InterfaceAnimal{

    public Caw() {

    }

    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
