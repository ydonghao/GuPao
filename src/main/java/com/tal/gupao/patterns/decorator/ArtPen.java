package com.tal.gupao.patterns.decorator;

public class ArtPen extends PenDecorator {

    @Override
    public int sell() {
        System.out.println("This is an art pen.");
        return super.sell();
    }
}
