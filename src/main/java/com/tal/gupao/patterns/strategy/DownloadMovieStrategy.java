package com.tal.gupao.patterns.strategy;

@FunctionalInterface
public interface DownloadMovieStrategy {

    String download(String movie);

}
