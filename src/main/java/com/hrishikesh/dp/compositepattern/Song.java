package com.hrishikesh.dp.compositepattern;

/**
 * @author hrishikesh.mishra
 */
public class Song extends SongComponent {
    private String songName;
    private String brandName;
    private int releaseYear;

    public Song(String songName, String brandName, int releaseYear) {
        this.songName = songName;
        this.brandName = brandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }


    @Override
    public void displaySongInfo() {
        System.out.printf("(%s recorded by %s in %d.)\n",  getSongName(), getBrandName(), getReleaseYear());
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
