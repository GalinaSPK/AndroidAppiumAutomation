package test1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test public void testGetLocalNumber ()
    {
        int num = MainClass.getLocalNumber();
        Assert.assertEquals("Проверка метода getLocalNumber провалена", 14, num);
        System.out.println("Проверка успешна");
    }
}
