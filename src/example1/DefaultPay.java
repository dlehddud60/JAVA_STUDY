package example1;

public class DefaultPay implements Pay{

    public boolean pay(int amount) {
        System.out.println("페이 연동에 실패하였습니다.");
        return false;
    }
}
