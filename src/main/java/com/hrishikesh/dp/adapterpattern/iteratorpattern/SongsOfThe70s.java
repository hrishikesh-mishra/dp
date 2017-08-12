package com.hrishikesh.dp.adapterpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hrishikesh.mishra
 */
public class SongsOfThe70s implements SongIterator {

    private List<Song> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<>();;
        addSong("Imagine", "John Lennon", 1977);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I will Survive", "Gloria Gaynor", 1979);
    }

    private void addSong(String songName, String brandName, int year) {
        bestSongs.add(new Song(songName, brandName, year));
    }

    @Override
    public Iterator<Song> createIterator() {
        return bestSongs.iterator();
    }
}
