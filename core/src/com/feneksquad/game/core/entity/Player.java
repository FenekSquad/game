package com.feneksquad.game.core.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.feneksquad.game.core.physic.Physic;
import com.feneksquad.game.core.resource.Resource;

import static com.feneksquad.game.core.graphics.BatchKeeper.BATCH;

    public class Player {
    public float x, y;
    public float width = 2;
    public float height = 2;
    private Texture playerTexture = Resource.getTexture("player.png");

    public Player(){
        Physic.createRectangleBody(x,y,width,height, BodyDef.BodyType.DynamicBody,true);
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) y+= 0.05;
        if (Gdx.input.isKeyPressed(Input.Keys.S)) y-= 0.05;
        if (Gdx.input.isKeyPressed(Input.Keys.D)) x+= 0.05;
        if (Gdx.input.isKeyPressed(Input.Keys.A)) x-= 0.05;
    }

    public void render() {
        BATCH.draw(playerTexture, x, y, width, height);
    }
}