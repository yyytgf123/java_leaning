package Poly.ex3;

//부모 클래스
//추상 클래스
public abstract class AbstractAnimal {
    //추상 메서드
    public abstract void sound();

    //추상 메서드가 아님 -> 자식 클래스가 오버라이딩 해지 않아도 됌
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
