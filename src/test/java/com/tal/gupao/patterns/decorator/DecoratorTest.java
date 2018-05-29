package com.tal.gupao.patterns.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void should_sell_1$_when_it_is_simple_pen () {
        Assert.assertEquals(1, new SimplePen().sell());
    }

    @Test
    public void should_sell_10$_when_it_is_art_pen () {
        Assert.assertEquals(10, new ArtPen().sell());
    }

}
