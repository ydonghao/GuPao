package com.tal.gupao.patterns.strategy;

public class XunleiStrategy implements DownloadMovieStrategy {

    final static String XUNLEI_COMMENT = "Xunlei download movie:";

    @Override
    public String download(String movie) {
        return XUNLEI_COMMENT + movie;
    }

}
