package com.tal.gupao.patterns.template;

public class One extends AnythingTemplate {
    @Override
    protected void step1() {
        System.out.println("One step1");
    }

    @Override
    protected void step2() {
        System.out.println("One step2");
    }

    @Override
    protected void step3() {
        System.out.println("One step3");
    }

    @Override
    protected void step4() {
        System.out.println("One step4");
    }
}
