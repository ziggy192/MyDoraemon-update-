package com.mygdx.game.main;


import com.mygdx.game.worlds.World;

public class Handler {

    public static final float WORLD_WIDTH = 720;
    public static final float WORLD_HEIGHT  = 1280;


    private World world;
    private DoremonJump doremonJump;

    private final float world_to_scene_width;
    private final float world_to_scene_height;


    public Handler(DoremonJump doremonJump) {
        this.doremonJump = doremonJump;

        world_to_scene_width = doremonJump.getWidth()/ WORLD_WIDTH;
        world_to_scene_height = doremonJump.getHeight() / WORLD_HEIGHT;

    }

    public int getWidth() {
        return doremonJump.getWidth();
    }

    public int getHeight() {
        return doremonJump.getHeight();
    }

    public void setWorld(World world) {
        this.world = world;
    }



    public World getWorld() {
        return this.world;
    }

    public DoremonJump getGame() {
        return this.doremonJump;
    }



    public float getWorld_to_scene_width() {
        return world_to_scene_width;
    }

    public float getWorld_to_scene_height() {
        return world_to_scene_height;
    }
}
