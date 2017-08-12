package com.hrishikesh.dp.iteratorpattern;

/**
 * @author hrishikesh.mishra
 */
public class Song {
    private String songName;
    private String brandName;
    private int yearReleased;

    public Song(String songName, String brandName, int yearReleased) {
        this.songName = songName;
        this.brandName = brandName;
        this.yearReleased = yearReleased;
    }


    public String getSongName() {
        return songName;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", yearReleased=" + yearReleased +
                '}';
    }
}
