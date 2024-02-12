package example1;


public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다." + "페이 종류 : " + option + "잔액 : " + amount);
        //option에 따라서 어떤 페이가 들어와도 유연하게 처리가 되야함
        Pay pay = PayStore.findPay(option); //옵션값에 따른 자식 객체를 생성 다형적 참조
/*
      1.option값으로 어떤 페이로 결제할 것인지 받는다.
      2. 만약 weixin 값이라는 값을 넘겨받았으면 그에 맞는 자식 객체를 생성한다.
      3. 그렇지 않을경우 null값이 반환되어야 하지만 null값은 어찌됬거나 좋은것은 아니기 때문에 Default객체가 생성되어 반환된다.
*/
        boolean result = pay.pay(amount); // 다형적 참조에 의한 메서드 오버라이딩 자식 메서드가 호출됨
/*
       1. 객체를 생성하여 생성된 객체의 pay매소드를 호출한다.
       2. 오버라이딩 된 pay메서드를 호출하여 결제를 진행한다.
       3. 결제가 완료되면 result값을 true로 반환한다.
       4. 만약 defult객체의 pay메소드가 호출이 된다면 결제는 실패하며 결과는 false를 반환한다.
*/

        if(result) {
            System.out.println("결제가 성공 되었습니다.");
//            weixin alipay같은 값을 넘겨받아 생성된 객체로 결제를 하였을 경우 reuslt를 반환
        }else {
            System.out.println("결제에 실패하였습니다.");
//            두개의 페이 이외의 값을 받았을 때 Defalt인스턴스가 생성되어 false반환하여 실패
        }


    }


}
