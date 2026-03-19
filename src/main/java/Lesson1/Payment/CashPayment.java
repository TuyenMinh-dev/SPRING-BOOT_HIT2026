package Lesson1.Payment;
import org.springframework.stereotype.Component;
@Component("cash")
public class CashPayment implements IPaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Đang thanh toán "+amount+" đồng bằng tiền mặt");

    }  ;
    @Override
    public String getMethodName(){
        return "Thanh toán bằng tiền mặt";
    };
}
