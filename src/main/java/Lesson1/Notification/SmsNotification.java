package Lesson1.Notification;


import org.springframework.stereotype.Component;


@Component("smsNotify")
public class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String to, String message){
        System.out.println("Dang gui tin nhan den "+to+" : " + message);
    };
}
