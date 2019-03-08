package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void add(){
        CalculatorInterface calc = new CalculatorServiceImpl();
        int result = calc.add(10,20);
        Assert.assertEquals("Add 2+3", 30, result);
        //System.out.println(result);
    }
}
