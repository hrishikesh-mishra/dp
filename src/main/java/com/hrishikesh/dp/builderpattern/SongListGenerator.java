package com.hrishikesh.dp.builderpattern;

import com.hrishikesh.dp.compositepattern.DiscJockey;
import com.hrishikesh.dp.compositepattern.Song;
import com.hrishikesh.dp.compositepattern.SongComponent;
import com.hrishikesh.dp.compositepattern.SongGroup;

/**
 * @author hrishikesh.mishra
 */
public class SongListGenerator {

    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup("Industrial", " is a style of experimental music.");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", " is a genre of rock.");
        SongComponent dubstepMusic = new SongGroup("Dubstep", " is a genre of electronic dance.");

        SongComponent everySong = new SongGroup("Song List ", "Every Song Available.");
        everySong.add(industrialMusic);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey discJockey = new DiscJockey(everySong);
        discJockey.getSongList();


    }
}
