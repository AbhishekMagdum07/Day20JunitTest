package com.JunitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {

    // Uc1 = As a User need to enter a valid First Name = First name starts with Cap and has minimum 3 characters
    public boolean firstName(String  name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");

        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }
}
