package com.feneksquad.game.core.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.feneksquad.game.MyGdxGame;

public class MainGame extends Game {
    @Override
    public void create() {
        Gdx.app.log("Fenek", "Game");
        setScreen(new MyGdxGame());
    }
}