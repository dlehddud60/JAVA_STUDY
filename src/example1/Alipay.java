package example1;

public class Alipay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("Alipay 와 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
