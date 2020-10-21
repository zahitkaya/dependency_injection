package com.example.dependency_injection.constructor_type;

public class Upload {
    Files file;
    public Upload(Files file){
        this.file=file;
    }
    public void sendFiles(){
        System.out.println("Your "+ file.getFileType()+ "type file sending. Remaining MegaByte: "+file.getSize());
    }

}
