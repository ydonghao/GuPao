package com.tal.gupao.patterns.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void test() {
        AnythingTemplate one = new One();
        AnythingTemplate two = new Two();
        one.execute();
        two.execute();
    }

}
