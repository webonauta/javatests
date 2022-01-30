package com.platzi.javatests.util;

import static com.platzi.javatests.util.PasswordUtil.SecurityLevel.WEAK;

public class PasswordUtil {

    public enum SecurityLevel{
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assesPassword(String password){
        if(password.length() < 8){
            return SecurityLevel.WEAK;
        }

        if(password.matches("[a-zA-Z]+")){
            return  SecurityLevel.MEDIUM;
        }

        if(password.matches("[a-zA-Z0-9]+")){
            return  SecurityLevel.MEDIUM;
        }

        return SecurityLevel.STRONG;
    }


}
