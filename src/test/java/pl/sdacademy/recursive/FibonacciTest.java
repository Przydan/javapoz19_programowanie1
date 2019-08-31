package pl.sdacademy.recursive;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public voirecursive()on() {
        // given
        Fibonacci fibonacci = new Fibonacci();
        //when

        //then
        Assert.assertEquals(0,fibonacci.recursive(0));
        Assert.assertEquals(1,fibonacci.recursive(1));
        Assert.assertEquals(1,fibonacci.recursive(2));
        Assert.assertEquals(2,fibonacci.recursive(3));
        Assert.assertEquals(3,fibonacci.recursive(4));
        Assert.assertEquals(5,fibonacci.recursive(5));
        Assert.assertEquals(8,fibonacci.recursive(6));
    }

    @Test
    public void recursive() {
        // given
        Fibonacci fibonacci = new Fibonacci();
        //when

        //then
        Assert.assertEquals(0,fibonacci.recursive(0));
        Assert.assertEquals(1,fibonacci.recursive(1));
        Assert.assertEquals(1,fibonacci.recursive(2));
        Assert.assertEquals(2,fibonacci.recursive(3));
        Assert.assertEquals(3,fibonacci.recursive(4));
        Assert.assertEquals(5,fibonacci.recursive(5));
        Assert.assertEquals(8,fibonacci.recursive(6));
    }
}