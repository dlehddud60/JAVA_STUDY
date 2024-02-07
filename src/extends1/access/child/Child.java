package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    //부모와 자식은 서로 다른 패키지에 위치
    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
//        defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
//        privaeValue = 1;  //접근 불가 컴파일 오류

        publicMethod();
        protectedMethod();//상속 관계 or 같은 패키지
//        defaultMethod();
//        privateMethod();
        printParent();//public이며 자기 자신 안에 있는 메소드들은 전부다 호출이 가능
    }
}
