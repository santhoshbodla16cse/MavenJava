package com.practice.santhosh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String uname  = "sbodla";
        String password = "manjula786";


        Login login = new Login();
        System.out.println("welocme " + login.validate(uname, password));
    }
}