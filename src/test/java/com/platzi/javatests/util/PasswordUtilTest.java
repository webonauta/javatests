package com.platzi.javatests.util;

import org.junit.Test;
import util.PasswordUtil;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void WeakWhenHasLessThan8Letters(){
        assertEquals( PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assesPassword("1234567"));
    }

    @Test
    public void WeakWhenHasOnlyLetters(){
        assertEquals( PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assesPassword("abcdef"));
    }

    @Test
    public void MediumWhenHasLettersAndNumbers(){
        assertEquals( PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assesPassword("abcdef1234567"));
    }

    @Test
    public void StrongWhenHasLettersNumbersAndSymbols(){
        assertEquals( PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assesPassword("abcdef1234567!"));
    }
}