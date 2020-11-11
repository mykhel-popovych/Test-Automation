package com.company;

public class MyException extends Exception {
    private String check;
    public MyException(String message, String check){
        super(message);
        this.check = check;
    }

    public MyException(String s) { }

    public String getCheck() {
        return check;
    }
}

