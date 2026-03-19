package Lesson1.Payment;

public interface IPaymentMethod {
    void pay(double amount)  ;
    String getMethodName();
}
