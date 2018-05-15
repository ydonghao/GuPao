package com.tal.gupao.patterns.singleton;

public final class LazyTal {

    private static LazyTal tal;

    private LazyTal() {
    }

    public static LazyTal getInstance() {
        synchronized (LazyTal.class) {
            if (tal == null) {
                tal = new LazyTal();
            }
        }
        return tal;
    }
}