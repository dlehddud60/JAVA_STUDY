package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //단 자식의 기능을 호출할 수 없음 컴파일 오류가 발생한다.

        //다운케스팅
        Child child = (Child) poly;
        child.childMethod();

        //일시적 다운 케스팅 -해당 메서드를 호출하는 순간만 케스팅
        (( Child) poly).childMethod();

    }
}
