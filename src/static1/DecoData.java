package static1;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        //instanceValue++; //접근 불가

        staticMethod();
        //instanceMethod(); //접근 불가
    }

    //모두 접근 가능
    public void instanceCall() {
        staticValue++;
        instanceValue++;

        staticMethod();
        instanceMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();;
    }

    private void instanceMethod() {
        System.out.println("instatnceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticMehod = " + staticValue);
    }
}
