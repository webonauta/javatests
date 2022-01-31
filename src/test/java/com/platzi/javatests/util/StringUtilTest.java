package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;
import util.StringUtil;

public class StringUtilTest {

    @Test
    public void testRepeatOnce() {

        Assert.assertEquals(StringUtil.repeat("Hola", 1), "Hola");
    }

    @Test
    public void testRepeatMultipleTimes() {

        Assert.assertEquals(StringUtil.repeat("Hola", 3), "HolaHolaHola");
    }


}