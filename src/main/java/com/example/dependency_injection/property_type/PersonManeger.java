package com.example.dependency_injection.property_type;

public class PersonManeger {
     public User user;
    public void addPerson(){
        //System.out.println(user.getId()+" Numaralı "+ user.getName()+ " kişi eklendi");

        System.out.println(this.user.printHello());
    }
}
