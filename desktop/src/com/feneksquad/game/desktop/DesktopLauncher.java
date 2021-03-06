package com.feneksquad.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.feneksquad.game.MyGdxGame;
import com.feneksquad.game.core.screens.MainGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Fenek Game";
        config.width = 480;
        config.height = 320;
        new LwjglApplication(new MainGame(), config);
    }
}
