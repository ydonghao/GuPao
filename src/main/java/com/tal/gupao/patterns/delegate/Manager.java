package com.tal.gupao.patterns.delegate;

public class Manager implements MakeMoney {

    EmployeeA a = new EmployeeA();
    EmployeeB b = new EmployeeB();

    @Override
    public void makeMoney(String money) {
        a.makeMoney(money);
        b.makeMoney(money);
    }
}
