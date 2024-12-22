package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();

        defaultClass1.message();
    }
}

class DefaultClass1 {

    void message() {
        System.out.println(1);
    }
}

class DefaultClass2 {

}
