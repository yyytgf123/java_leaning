package Poly.ex4;

public class InterfaceMain {
    public static void main(String[] args) {

        InterfaceAnimal[] interfaceAnimals = new InterfaceAnimal[3];
        interfaceAnimals[0] = new Cat();
        interfaceAnimals[1] = new Dog();
        interfaceAnimals[2] = new Caw();

        for(InterfaceAnimal i : interfaceAnimals) {
            soundAnimal(i);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal) {

        System.out.println("\n"+"동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
