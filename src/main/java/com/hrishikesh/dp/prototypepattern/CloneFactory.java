package com.hrishikesh.dp.prototypepattern;

/**
 * @author hrishikesh.mishra
 */
public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }

}
