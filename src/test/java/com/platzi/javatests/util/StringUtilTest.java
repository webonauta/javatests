package com.platzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola", 3);
        assertEquals(result, "HolaHolaHola");

        String result2 = StringUtil.repeat("Hola", 1);
        assertEquals(result2, "Hola");
    }

    private static void assertEquals(String actual, String expected) {

        if(!actual.equals(expected)) {
            throw new RuntimeException(actual + "is not equal to expected" + expected);
        }
    }
}