package com.feneksquad.game.core.item;

import com.badlogic.gdx.graphics.Texture;

public class Item {
    int id;
    Texture texture;

    public Texture getTexture() {
        return texture;
    }

    public int getId() {
        return id;
    }

    public Item(int id, Texture texture) {
        this.id = id;
        this.texture = texture;
    }
}