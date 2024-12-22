package extend1.access.parent;

public class Parent {

    public int publicValue;
    protected  int protectValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectMethod() {
        System.out.println("Parent.protectMethod");
    }


    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printMethod() {
        System.out.println("==Parent 메소드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectdValue = " + protectValue);
        System.out.println("defaultValeu = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        defaultMethod();
        privateMethod();
    }
}
