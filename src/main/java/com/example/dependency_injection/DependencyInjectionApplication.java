package com.example.dependency_injection;

import com.example.dependency_injection.constructor_type.Files;
import com.example.dependency_injection.constructor_type.Upload;
import com.example.dependency_injection.property_type.PersonManeger;
import com.example.dependency_injection.property_type.User;
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
        System.out.println();

        Phone p= new Phone();
        p.setName("Zahit");
        p.setPhoneNumber(507);
        Messager messager=new Messager();
        messager.sendMessage(p);
        System.out.println("*************************");
        System.out.println("Constructor Type ");
        System.out.println();

        Files files=new Files(".docx",12.4);
        Upload upload=new Upload(files);
        upload.sendFiles();

        System.out.println("***************");
        System.out.println("Property Type ");
        PersonManeger personManeger =new PersonManeger();
        User user=new User();
        personManeger.user=user;
        personManeger.addPerson();




    }

}
