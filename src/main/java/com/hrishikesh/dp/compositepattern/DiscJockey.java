package com.hrishikesh.dp.compositepattern;

/**
 * @author hrishikesh.mishra
 */
public class DiscJockey {

    private SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
