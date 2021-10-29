package com.feneksquad.game.core.item;

import com.badlogic.gdx.Gdx;

import java.util.HashMap;

public class Items {
    public static HashMap<Integer, Item> items = new HashMap<>();

    public static void defineItem(Item item){
        items.put(item.getId(),item);
        Gdx.app.log("Items", "item defined item with id " + item.getId());
    }
    public static Item getItem(int id){
        return items.get(id);
    }
}