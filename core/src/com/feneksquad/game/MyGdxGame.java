package com.feneksquad.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.feneksquad.game.core.physic.Physic;
import com.feneksquad.game.core.world.Block;
import com.feneksquad.game.core.world.Blocks;
import com.feneksquad.game.core.entity.Player;
import com.feneksquad.game.core.resource.Resource;
import com.feneksquad.game.core.utils.Camera2D;
import com.feneksquad.game.core.utils.GameCameraController;
import com.feneksquad.game.core.world.Map;
import com.feneksquad.game.core.world.MapRenderer;

import static com.feneksquad.game.core.graphics.BatchKeeper.BATCH;

public class MyGdxGame implements Screen {
    Box2DDebugRenderer DR;
    Texture img;
    Player player;
    Block block;
    Map map;
    public static Camera2D gameCamera;

    public MyGdxGame() {
        DR = new Box2DDebugRenderer();
        Blocks.defineBlock(new Block(2, Resource.getTexture("wood.png")));
        Blocks.defineBlock(new Block(1, Resource.getTexture("dirt.png")));
        map = new Map();
        player = new Player();
        gameCamera = new Camera2D(20);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 1);
        player.update();
        Physic.update();
        GameCameraController.setPosition(player);
        gameCamera.update(BATCH);
        BATCH.begin();
        MapRenderer.render(map);
        player.render();
        BATCH.end();
        DR.render(Physic.getWorld(), gameCamera.CAMERA.combined);
        //System.out.println((Gdx.app.getJavaHeap() + Gdx.app.getNativeHeap()) / 1024 / 1024 + " Mb");
    }

    @Override
    public void show() {

    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        BATCH.dispose();
        img.dispose();
    }
}