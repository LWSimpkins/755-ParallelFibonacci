/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parallelfibonacci;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Lindsay
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of run method, of class Fibonacci.
     */
    @Test
    public void testRun() {
        System.out.println("FibonacciTest: testRun");
        int n =5;
        int result[] = new int[n+1];
        Fibonacci fibonacci = new Fibonacci(n, result);
        fibonacci.run();
        int[] expectedResult ={0,1,1,2,3,5};
        Assert.assertArrayEquals(result,expectedResult);
    }
    
}
