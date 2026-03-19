package Lesson1;
import Lesson1.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApp {

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
    @Bean
    public CommandLineRunner run(OrderService orderService) {
        return args -> {

            orderService.processOrder("Lê Minh Tuyên", "Bàn phím cơ AKKO", 1500000);
        };
    }
}
