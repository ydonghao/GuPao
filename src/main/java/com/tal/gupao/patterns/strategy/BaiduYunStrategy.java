package com.tal.gupao.patterns.strategy;

public class BaiduYunStrategy implements DownloadMovieStrategy{
    final static String BAIDUYUN_COMMENT = "BaiduYun download movie:";

    @Override
    public String download(String movie) {
        return BAIDUYUN_COMMENT + movie;
    }
}
