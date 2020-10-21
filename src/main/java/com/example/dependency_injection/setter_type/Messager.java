package com.example.dependency_injection.setter_type;

public class Messager {
    private Phone phone;
    public void sendMessage(Phone phone){
        this.phone=phone;
        System.out.println("Your message sended to "+phone.getName()+" "+phone.getPhoneNumber());
    }
}
