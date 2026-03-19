package Lesson1.Payment;

import org.springframework.stereotype.Component;

@Component

public class MoMoPayment implements IPaymentMethod {
    @Override

    public void pay(double amount) {
        System.out.println("Da thanh toan " + amount + "dong qua MOMO ");
    }


    ;

    @Override
    public String getMethodName() {
        return "Dang dung MOMO";
    }

    ;
}
