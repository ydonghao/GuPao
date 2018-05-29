package com.tal.gupao.patterns.delegate;

import org.junit.Test;

public class DelegateTest {

    @Test
    public void should_make_1million_when_given_1000000() {
        Boss boss = new Boss();
        boss.makeMoney();
    }

}
