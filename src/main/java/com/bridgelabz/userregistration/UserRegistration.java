package com.bridgelabz.userregistration;
import java.util.regex.Pattern;
public class UserRegistration {
    String namePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    String passwordPattern="[a-zA-Z0-9]{8,}$";
    String passwordPattern2="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)+$";
    String passwordPattern3="^([A-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";
    String passwordPattern4="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*)|([a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]+[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*)$";
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
    }
    public boolean checkName(String name) {
        return Pattern.matches(namePattern,name);
    }
    public boolean checkEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }

    public boolean checkMobile(String MobileNumber) {
        return Pattern.matches(mobilePattern,MobileNumber);
    }

    public boolean checkPassword(String Password ) {
        return Pattern.matches(passwordPattern,Password);
    }


    public boolean checkPassword2(String Password2) {
        if (Password2.length() >= 8)
            return (Pattern.matches(passwordPattern2, Password2));
        else
            return false;
    }

    public boolean checkPassword3(String Password3) {
        if (Password3.length() >= 8)
            return (Pattern.matches(passwordPattern3, Password3));
        else
            return false;
    }

    public boolean checkPassword4(String Password4) {
        if (Password4.length() >= 8)
            return (Pattern.matches(passwordPattern4, Password4));
        else
            return false;

    }
}
