package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AppStartupService implements BeanNameAware {

    private String beanName;

    // 1. Thực thi BeanNameAware: Spring sẽ gọi hàm này ngay sau khi tạo Bean để đặt tên
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println(">>> Bean Name set to: " + this.beanName);
    }

    // 2. @PostConstruct: Chạy ngay sau khi Bean đã được khởi tạo và Dependency Injection hoàn tất
    @PostConstruct
    public void init() {
        System.out.println(">>> Application initialized at: " + LocalDateTime.now());
    }

    // 3. @PreDestroy: Chạy ngay trước khi Spring Context bị đóng (Server tắt)
    @PreDestroy
    public void destroy() {
        System.out.println(">>> Application shutting down at: " + LocalDateTime.now());
    }
}