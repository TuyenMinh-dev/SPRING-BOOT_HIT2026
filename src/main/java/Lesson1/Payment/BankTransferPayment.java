package Lesson1.Payment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //ưu tiên dùng

public class BankTransferPayment implements IPaymentMethod {
    @Override
    public void pay(double amount){
        System.out.println("Đang tạo mã QR ... Bạn đã  thanh toán " + amount + "đ qua ngân hàng");
    }  ;
    @Override
    public String getMethodName(){
        return "Chuyển khoản bằng ngân hàng";
    };
}
