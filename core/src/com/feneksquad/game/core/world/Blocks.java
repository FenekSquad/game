package com.feneksquad.game.core.world;

import com.badlogic.gdx.Gdx;
import java.util.HashMap;

public class Blocks {
    public static HashMap<Integer, Block> blocks = new HashMap<>();

    public static void defineBlock(Block block){
        blocks.put(block.getId(),block);
        Gdx.app.log("Blocks", "block defined block with id " + block.getId());
    }

    public static Block getBlock(int id) {
        return blocks.get(id);
    }
}