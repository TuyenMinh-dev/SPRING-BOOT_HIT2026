package Lesson1;

import Lesson1.Payment.IPaymentMethod;
import Lesson1.Notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final IPaymentMethod paymentMethod;
    private final NotificationService notificationService;

    // Constructor Injection
    @Autowired
    public OrderService(
            IPaymentMethod paymentMethod, // Spring sẽ lấy thằng có @Primary (BankTransfer)
            @Qualifier("smsNotify") NotificationService notificationService // Ép lấy thằng Sms
    ) {
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    public void processOrder(String customer, String product, double amount) {
        System.out.println("\n--- BẮT ĐẦU XỬ LÝ ĐƠN HÀNG ---");
        System.out.println("Khách hàng: " + customer);
        System.out.println("Sản phẩm: " + product);

        paymentMethod.pay(amount);
        notificationService.sendNotification(customer, "Đơn hàng " + product + " đã đặt thành công!");
                                              //to:customer ;  message:"don hang"........"da dat thanh cong;

        System.out.println("Hình thức thanh toán sử dụng: " + paymentMethod.getMethodName());
        System.out.println("--- KẾT THÚC ---");
    }
}
