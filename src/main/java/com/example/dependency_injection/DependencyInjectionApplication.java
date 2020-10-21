package com.example.dependency_injection;

import com.example.dependency_injection.setter_type.Messager;
import com.example.dependency_injection.setter_type.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);

        System.out.println("*********************************");
        System.out.println("Dependency Injection");
        System.out.println("Setter type *********************");

        Phone p= new Phone();
        p.setName("Zahit");
        p.setPhoneNumber(507);
        Messager messager=new Messager();
        messager.sendMessage(p);
    }

}
