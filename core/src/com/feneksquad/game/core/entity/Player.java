package com.feneksquad.game.core.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.feneksquad.game.core.physic.Physic;
import com.feneksquad.game.core.resource.Resource;

import static com.feneksquad.game.core.graphics.BatchKeeper.BATCH;

    public class Player {
    public float width = 2;
    public float height = 2;
    public float getX() {
        return body.getPosition().x;
    }
    public float getY(){
        return body.getPosition().y;
    }
    public Vector2 vector = new Vector2();
    private Body body;
    private Texture playerTexture = Resource.getTexture("player.png");

    public Player(){
        body = Physic.createRectangleBody(0,0,width,height, BodyDef.BodyType.DynamicBody,true);
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)) vector.y = 2.1f;
        if (Gdx.input.isKeyPressed(Input.Keys.S)) vector.y = -2.1f;
        if (Gdx.input.isKeyPressed(Input.Keys.D)) vector.x = 2.1f;
        if (Gdx.input.isKeyPressed(Input.Keys.A)) vector.x = -2.1f;
        body.setLinearVelocity(vector);
        vector.x = 0;
        vector.y = 0;
    }

    public void render() {
        BATCH.draw(playerTexture, getX() - width/2, getY() - height/2, width, height);
    }
}