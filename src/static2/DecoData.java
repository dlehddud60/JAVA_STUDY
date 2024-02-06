package static2;

import java.sql.Statement;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++;
//        instanceMethod();
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접ㅊ
    }

    public void instanceCall() {

        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }


    private void instanceMethod() {
        System.out.println("instanceValue" + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
