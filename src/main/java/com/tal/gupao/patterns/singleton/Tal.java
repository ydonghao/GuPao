package com.tal.gupao.patterns.singleton;

public final class Tal {

    private static Tal tal = new Tal();

    private Tal() {
    }

    public static Tal getInstance() {
        return tal;
    }
}
