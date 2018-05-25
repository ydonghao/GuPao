package com.tal.gupao.patterns.template;

public abstract class AnythingTemplate {

    public void execute() {
        step1();
        step2();
        step3();
        step4();
    }

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
    protected abstract void step4();

}
