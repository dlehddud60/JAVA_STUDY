package example1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        if(option.equals("weixinpay")){
            return new WeixinPay();
        }else if(option.equals("alipay")) {
            return new Alipay();
        }else if(option.equals("rakutenpay")) {
            return new RakutenPay();
        }else {
            return new DefaultPay();
        }
    }
}
