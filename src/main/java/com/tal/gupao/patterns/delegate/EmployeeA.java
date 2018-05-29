package com.tal.gupao.patterns.delegate;

public class EmployeeA implements MakeMoney {
    @Override
    public void makeMoney(String money) {
        System.out.println("I am employee A, I make "+money);
    }
}
