package com.feneksquad.game.core.world;

import static com.feneksquad.game.core.graphics.BatchKeeper.BATCH;

public class MapRenderer {
    public static void render(Map map) {
        for (int x = 0; x < map.map.length; x++) {
            for (int y = 0; y < map.map[x].length; y++) {
                for (int z = 0; z < map.map[x][y].length; z++) {
                    BATCH.draw(Blocks.getBlock(map.map[x][y][z].id).getTexture(), x, y, 1, 1);
                }
            }
        }
    }
}