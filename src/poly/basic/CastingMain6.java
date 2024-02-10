package poly.basic;

//다운케스팅을 자동으로 하지 않는 이유
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2 );

    }

    private static void call(Parent parent ) {
        parent.parentMethod();
        //Child 인스턴스인경우 ChildMethod실행
        if(parent instanceof Child child) {
            //16부터는 변수를 선언할 수 있다.
            System.out.println("Child 인스턴스가 맞음");
//            Child child = (Child) parent; 매개변수로 선언하였기 때문에 필요 없는 코드가 됨  바로 child 변수를 사용할 수 있다.
//            다운케스팅을 시켜버림 아예 incetaneof로 확인하기 때문에 다운케스팅을 해도 문제가 없
            child.childMethod();
        }
    }
}
