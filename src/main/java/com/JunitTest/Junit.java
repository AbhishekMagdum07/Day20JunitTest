package com.JunitTest;

import jdk.jfr.StackTrace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {

    // Uc1 = As a User need to enter a valid First Name = First name starts with Cap and has minimum 3 characters
    public boolean firstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    // Uc2 = As a User need to enter a valid Last Name = Last name starts with Cap and has minimum 3 characters
    public boolean lastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.find();
    }

    // Uc3 = As a User need to enter a valid email
    //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) wit precise @ and . positions
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-z][a-z0-9-.+]*@[a-z0-9]*[.][a-z.]*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    // Uc4 = As a User need to follow pre -define Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
    public boolean phoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^[+]\\d{2} \\d{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }
    public boolean password(String password){
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[\\d])(?=.*[\\W])[\\w\\W]{8,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }


}
