package test2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber ()
    {
        MainClass mc = new MainClass();
        int cn = mc.getClassNumber();
        Assert.assertTrue("Значение class_number = " + cn + " должно быть больше 45",  cn > 45);
    }
}
