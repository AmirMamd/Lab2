import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EvenOrOddTest {
    @Test
    public void TestCases(){
        EvenOrOdd x= new EvenOrOdd();
        assertEquals("Even",x.detectEvenOrOdd(2));
        assertEquals("Even",x.detectEvenOrOdd(-2));
        assertEquals("Odd",x.detectEvenOrOdd(3));
        assertEquals("Odd",x.detectEvenOrOdd(-7));
        assertEquals("Even",x.detectEvenOrOdd(0));
        assertEquals("Odd",x.detectEvenOrOdd(123));
        assertEquals("Even",x.detectEvenOrOdd(328934212));
    }

}