package com.example.lab4;

public class User {
    // Attributes
    public String username;
    public String password;

    //getter
    public  String getUsername (){
        return  username ;
    }
    public  String getPassword(){
        return  password ;
    }

    // Method:
    Void login() {
        System.out.print(username);
        System.out.print(password);
        return null;
    }
}

