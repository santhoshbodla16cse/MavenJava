package com.practice.santhosh;

public class Login {

    public String validate(String uname, String password) {
        if(uname=="sbodla" && password =="manjula786"){
            return uname;
        }else{
            return "Unauthorized user";
        }
    }
}
