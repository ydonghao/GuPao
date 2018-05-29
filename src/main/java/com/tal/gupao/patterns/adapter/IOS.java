package com.tal.gupao.patterns.adapter;

public class IOS implements AndroidToIOSAdapter{

    @Override
    public Android getData(String data) {
        Android android = new Android();
        android.setData(data);
        return android;
    }
}
