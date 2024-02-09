package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //단 자식의 기능을 호출할 수 없음 컴파일 오류가 발생한다.
    }
}
