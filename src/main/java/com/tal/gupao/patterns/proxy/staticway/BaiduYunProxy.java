package com.tal.gupao.patterns.proxy.staticway;

public class BaiduYunProxy implements DownloadTool {
    private Tal proxyTarget;

    public BaiduYunProxy(Tal proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void downloadMovie() {
        proxyTarget.downloadMovie();
        System.out.println("BaiduYun is downloading movie:"+proxyTarget.getMovie());
    }
}
