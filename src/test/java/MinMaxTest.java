import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinMaxTest{
    @Test
    public void TestCases(){
        MinMax x= new MinMax();
        assertEquals(3.0,x.minimumDetection(new double[]{3.0,5.2,4.5,6.1}),0.02);
        assertEquals(-2,x.minimumDetection(new double[]{-2,5.2,4.5,6.1}),0.02);
        assertEquals(2.1,x.minimumDetection(new double[]{2.1,2.2,2.12,2.11}),0.02);
        assertEquals(-392,x.minimumDetection(new double[]{-4,-90,-202,-392}),0.02);
        assertEquals(482,x.minimumDetection(new double[]{4389,9320,4389443,32890921,4389,482,902,8402}),0.02);
        assertEquals(32890921,x.maximumDetection(new double[]{4389,9320,4389443,32890921,4389,482,902,8402}),0.02);
        assertEquals(-3,x.maximumDetection(new double[]{-3,-90,-8129}),0.02);
        assertEquals(4389.3490,x.maximumDetection(new double[]{-3,-90,40,23,4389.3490}),0.02);
        assertEquals(3490.251,x.maximumDetection(new double[]{3490.221,3490.231,3490.251,3490.226}),0.02);

    }
}