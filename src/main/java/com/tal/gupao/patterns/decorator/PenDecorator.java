package com.tal.gupao.patterns.decorator;

public class PenDecorator implements Pen {
    @Override
    public int sell() {
        return 10;
    }
}
