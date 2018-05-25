package com.tal.gupao.patterns.strategy;

public class DownloadMovieAction {

    private DownloadMovieStrategy downloadMovieStrategy;

    public DownloadMovieAction(DownloadMovieStrategy downloadMovieStrategy) {
        this.downloadMovieStrategy = downloadMovieStrategy;
    }

    public void changeStrategy(DownloadMovieStrategy strategy) {
        this.downloadMovieStrategy = strategy;
    }

    public String downloadMovie(String movie) {
        return downloadMovieStrategy.download(movie);
    }
}
