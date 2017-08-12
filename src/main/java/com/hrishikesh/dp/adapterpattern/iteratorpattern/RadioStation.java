package com.hrishikesh.dp.adapterpattern.iteratorpattern;

/**
 * @author hrishikesh.mishra
 */
public class RadioStation {

    public static void main(String[] args) {
        SongsOfThe70s songs70s = new SongsOfThe70s();
        SongsOfThe80s songs80s = new SongsOfThe80s();
        SongsOfThe90s songs90s = new SongsOfThe90s();

        DiscJockey jockey = new DiscJockey(songs70s, songs80s, songs90s);

        jockey.showTheSongs();

    }
}