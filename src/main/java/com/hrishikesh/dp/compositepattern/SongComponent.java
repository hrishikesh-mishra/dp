package com.hrishikesh.dp.compositepattern;

/**
 * @author hrishikesh.mishra
 */
public abstract class SongComponent {

    public void add(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentInext){
        throw new UnsupportedOperationException();
    }

    public String getSongName( ){
        throw new UnsupportedOperationException();
    }

    public String getBandName( ){
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear( ){
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }

}
