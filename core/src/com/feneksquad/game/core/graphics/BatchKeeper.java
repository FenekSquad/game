package com.feneksquad.game.core.graphics;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public final class BatchKeeper {
    public static final SpriteBatch BATCH;
    static {
        BATCH = new SpriteBatch();
    }
}