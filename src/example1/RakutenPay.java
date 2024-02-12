package example1;

public class RakutenPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("RakutenPay 와 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
