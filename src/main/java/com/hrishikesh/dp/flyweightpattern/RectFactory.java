package com.hrishikesh.dp.flyweightpattern;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hrishikesh.mishra
 */
public class RectFactory {

    private static final Map<Color, MyRect> rectByColor = new HashMap<>();

    public static MyRect getRect(Color color){
        MyRect rect = rectByColor.get(color);
        if (rect == null){
            rect = new MyRect(color);
            rectByColor.put(color, rect);
        }
        return rect;
    }

}
