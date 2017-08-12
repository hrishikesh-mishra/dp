package com.hrishikesh.dp.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hrishikesh.mishra
 */
public class SongGroup extends SongComponent {

    private List<SongComponent> songComponents ;
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.songComponents = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent){
        songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent){
        songComponents.remove(songComponent);
    }

    public SongComponent getComponent(int componentIndex){
        return songComponents.get(componentIndex);
    }

    public void displaySongInfo(){
        System.out.printf("\n[%s %s.]\n\n", getGroupName(), getGroupDescription());

        Iterator<SongComponent> songComponentIterator = songComponents.iterator();

        while (songComponentIterator.hasNext()){
            SongComponent component = songComponentIterator.next();

            component.displaySongInfo();
        }

    }
}
