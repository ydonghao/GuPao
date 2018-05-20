package com.tal.gupao.patterns.proxy.staticway;

public class XunleiProxy implements DownloadTool {

    private Tal proxyTarget;

    public XunleiProxy(Tal proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void downloadMovie() {
        proxyTarget.downloadMovie();
        System.out.println("Xunlei is downloading movie:"+proxyTarget.getMovie());
    }
}
