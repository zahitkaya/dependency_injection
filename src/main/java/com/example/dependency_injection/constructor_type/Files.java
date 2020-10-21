package com.example.dependency_injection.constructor_type;

public class Files {
    private String fileType;
    private double size;

    public Files(String fileType, double size) {
        this.fileType = fileType;
        this.size = size;
    }
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
