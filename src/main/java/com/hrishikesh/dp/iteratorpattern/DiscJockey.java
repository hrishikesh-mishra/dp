package com.hrishikesh.dp.iteratorpattern;

import java.util.Iterator;

/**
 * @author hrishikesh.mishra
 */
public class DiscJockey {

    private SongIterator song70sIterator;
    private SongIterator song80sIterator;
    private SongIterator song90sIterator;

    public DiscJockey(SongIterator song70sIterator, SongIterator song80sIterator, SongIterator song90sIterator) {
        this.song70sIterator = song70sIterator;
        this.song80sIterator = song80sIterator;
        this.song90sIterator = song90sIterator;
    }

    public void showTheSongs(){
        Iterator<Song> song70s = song70sIterator.createIterator();
        Iterator<Song> song80s = song80sIterator.createIterator();
        Iterator<Song> song90s = song90sIterator.createIterator();

        System.out.println("Songs of the 70s:");
        printSongs(song70s);

        System.out.println("\nSongs of the 80s:");
        printSongs(song80s);

        System.out.println("\nSongs of the 90s:");
        printSongs(song90s);


    }

    private void printSongs(Iterator<Song> song70s) {
        while (song70s.hasNext()){
            Song song  = song70s.next();
            System.out.printf("(%s, %s, - %d )\n", song.getSongName(), song.getBrandName(), song.getYearReleased());
        }
    }
}
