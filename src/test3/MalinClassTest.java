package test3;

import org.junit.Assert;
import org.junit.Test;

public class MalinClassTest {
    @Test
 public void testGetClassString()
    {
        MainClass mc = new MainClass();
        String sc = mc.getClassString();
        Assert.assertTrue("classString должен содержать 'Hello' или 'hello'", sc.contains("Hello") || sc.contains("hello"));

    }
}
