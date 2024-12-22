package extend2.access.child;

import extend2.access.parent.Parent;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void publicMethod() {
        System.out.println("Child method");
    }

    public void call() {
        System.out.println(this.value);
        System.out.println(super.value);

        this.publicMethod();
        super.publicMethod();
    }
}
