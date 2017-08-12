package com.hrishikesh.dp.iteratorpattern;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author hrishikesh.mishra
 */
public class SongsOfThe80s implements SongIterator {
    private Song [] bestSongs;
    private int arrayValue = 0 ;

    public SongsOfThe80s() {
        this.bestSongs = new Song[3];

        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1988);
        addSong("head Overs Heels", "Tears of Fears", 1980);
    }

    private void addSong(String songName, String brandName, int year) {
        bestSongs[arrayValue++] = new Song(songName, brandName, year);
    }

    @Override
    public Iterator<Song> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
