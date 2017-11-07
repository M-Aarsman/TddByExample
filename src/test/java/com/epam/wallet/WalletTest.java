package com.epam.wallet;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WalletTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

}
