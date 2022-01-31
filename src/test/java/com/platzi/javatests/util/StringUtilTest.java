package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {

        Assert.assertEquals(StringUtil.repeat("Hola", 3), "HolaHolaHola");
        Assert.assertEquals(StringUtil.repeat("Hola", 1), "Hola");
    }


}