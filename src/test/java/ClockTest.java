import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ClockTest{
    @Test
    public void TestCases(){
        Clock c1= new Clock();
        assertEquals("2000-1-1",c1.clkFunctionalities("abadcaaaaa"));
        assertEquals("2001-2-3",c1.clkFunctionalities("caaabbababa"));

    }
}