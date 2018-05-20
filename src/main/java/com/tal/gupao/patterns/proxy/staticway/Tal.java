package com.tal.gupao.patterns.proxy.staticway;

public class Tal implements DownloadTool {

    private String movie;

    public Tal() {
    }

    public Tal(String movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public void downloadMovie() {
        System.out.println("I want to download movie:"+this.movie);
    }
}
