package com.tal.gupao.patterns.proxy;

import com.tal.gupao.patterns.proxy.cglib.CglibProxy;
import com.tal.gupao.patterns.proxy.jdkway.DynamicDownloadProxy;
import com.tal.gupao.patterns.proxy.staticway.BaiduYunProxy;
import com.tal.gupao.patterns.proxy.staticway.DownloadTool;
import com.tal.gupao.patterns.proxy.staticway.Tal;
import com.tal.gupao.patterns.proxy.staticway.XunleiProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void should_download_movie_by_xunlei_when_I_using_xunlei_proxy(){
        XunleiProxy proxy = new XunleiProxy(new Tal("Fighting!"));
        proxy.downloadMovie();
    }

    @Test
    public void should_download_movie_by_baidu_yun_when_I_using_xunlei_proxy(){
        BaiduYunProxy proxy = new BaiduYunProxy(new Tal("Fighting!"));
        proxy.downloadMovie();
    }

    @Test
    public void should_download_movie_when_I_want_to_download_movie() {
        Tal tal = new Tal("Fighting!");
        DownloadTool proxyInstance =
                (DownloadTool) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{DownloadTool.class}, new DynamicDownloadProxy(tal));
        proxyInstance.downloadMovie();
    }

    @Test
    public void shold_pass_normal_when_I_am_using_cglib() {
        CglibProxy proxy = new CglibProxy();
        Tal instance = (Tal) proxy.getInstance(new Tal("Fighting!"));
        instance.downloadMovie();
    }
}
