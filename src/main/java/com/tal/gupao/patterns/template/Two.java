package com.tal.gupao.patterns.template;

public class Two extends AnythingTemplate {
    @Override
    protected void step1() {
        System.out.println("Two step1");
    }

    @Override
    protected void step2() {
        System.out.println("Two step2");
    }

    @Override
    protected void step3() {
        System.out.println("Two step3");
    }

    @Override
    protected void step4() {
        System.out.println("Two step4");
    }
}
