package Poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
    }
}
