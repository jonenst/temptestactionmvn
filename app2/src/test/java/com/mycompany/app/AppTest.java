package com.mycompany.app;

import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue()
    {
        long k=0;
        for (int i=1; i<2000000000; i++) {
            for (int j=1; j<5; j++) {
                k=k+i+j;
            }
        }
        System.out.println(k);
    }
}
