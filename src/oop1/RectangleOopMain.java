package oop1;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 6;

        rectangle.calculateArea(); //아래와 동일

        int area = rectangle.calculateArea();
        System.out.println(area);
    }
}
