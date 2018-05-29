package com.tal.gupao.patterns.delegate;

public class Boss {

    Manager manager;

    public void makeMoney() {
        manager = new Manager();
        manager.makeMoney("One million dollar");
    }

}
