package com.tal.gupao.patterns.delegate;

public class EmployeeB implements MakeMoney {
    @Override
    public void makeMoney(String money) {
        System.out.println("I am employee B, I make "+money);
    }
}
