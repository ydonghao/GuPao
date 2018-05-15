package com.tal.gupao.patterns.singleton;

public enum EnumTal {

    INSTANCE;

    @Override
    public String toString() {
        return super.getDeclaringClass().getCanonicalName()+"@"+this.hashCode();
    }
}
