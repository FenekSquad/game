package com.feneksquad.game.core.utils;

import com.feneksquad.game.core.entity.Player;

import static com.feneksquad.game.MyGdxGame.gameCamera;

public class GameCameraController {
    public static void setPosition(Player player) {
        float x = player.getX() + (player.width / 2) - (gameCamera.W / 2f);
        float y = player.getY() + (player.height / 2) - (gameCamera.H / 2f);
        gameCamera.lookAt(x, y, true);
    }
}