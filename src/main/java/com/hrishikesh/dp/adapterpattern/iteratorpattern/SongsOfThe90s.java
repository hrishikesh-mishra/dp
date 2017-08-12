package com.hrishikesh.dp.adapterpattern.iteratorpattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hrishikesh.mishra
 */
public class SongsOfThe90s implements SongIterator {

    private Map<Integer, Song> bestSongs;
    private int hashKey = 0 ;

    public SongsOfThe90s() {
        this.bestSongs = new HashMap<>();

        addSong("Losing my religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1998);
        addSong("Walk on the Ocean", "Toad the Wet Sporcket", 1990);
    }

    private void addSong(String songName, String brandName, int year) {
        bestSongs.put(hashKey++, new Song(songName, brandName, year));
    }

    @Override
    public Iterator<Song> createIterator() {
        return bestSongs.values().iterator();
    }
}
