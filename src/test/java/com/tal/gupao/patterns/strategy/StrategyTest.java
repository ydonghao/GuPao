package com.tal.gupao.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    @Test
    public void should_download_av_when_I_give_rion() {
        DownloadMovieAction downloadMovie = new DownloadMovieAction(new XunleiStrategy());
        String rion = downloadMovie.downloadMovie("Rion");
        Assert.assertEquals(XunleiStrategy.XUNLEI_COMMENT+"Rion", rion);
        downloadMovie.changeStrategy(new BaiduYunStrategy());
        String 三上悠亜 = downloadMovie.downloadMovie("三上悠亜");
        Assert.assertEquals(BaiduYunStrategy.BAIDUYUN_COMMENT+"三上悠亜", 三上悠亜);
    }

}
