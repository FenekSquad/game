package com.feneksquad.game.core.world;

import com.badlogic.gdx.graphics.Texture;

public class Block {
    int id;
    Texture texture;

    public Texture getTexture() {
        return texture;
    }

    public int getId() {
        return id;
    }

    public Block(int id, Texture texture) {
        this.id = id;
        this.texture = texture;
    }
}