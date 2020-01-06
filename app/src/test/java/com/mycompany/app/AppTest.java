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
        int k=0;
        for (int i=0; i<2000000000; i++) {
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
                k=k+i;
        }
        System.out.println(k);
    }
}
