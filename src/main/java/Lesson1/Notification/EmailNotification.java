package Lesson1.Notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String to, String message){
            System.out.println("Gửi Email đến " + to + ": " + message);

    };
}
