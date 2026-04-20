/*
 * Name: Aydan Romayor
 * Date: 4/20/2026
 * File: Main.java
 * This code has several recursive methods, and at the end is a test method to test each method.
 */

import org.junit.Test;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing...");
    }

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;

        if (lastDigit == 8) return 1 + count8(n / 10);
        else return count8(n / 10);
    }

    @Test
    public void test() {
        Assert.assertEquals(count8(0),0);
        Assert.assertEquals(count8(8), 1);
        Assert.assertEquals(count8(81), 1);
        Assert.assertEquals(count8(1232188), 2);
        Assert.assertEquals(count8(8881888), 6);
    }
}