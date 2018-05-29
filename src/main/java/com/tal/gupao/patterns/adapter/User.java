package com.tal.gupao.patterns.adapter;

public class User implements AndroidToIOSAdapter {

    private IOS ios;

    public User() {
    }

    public User(IOS ios) {
        this.ios = ios;
    }

    public IOS getIos() {
        return ios;
    }

    public void setIos(IOS ios) {
        this.ios = ios;
    }

    @Override
    public Android getData(String data) {
        return ios.getData(data);
    }
}
