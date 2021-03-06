package com.rockbite.hackathon.sm.components.render;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Color;

public class TransformComponent implements Component{
    public float x;
    public float y;
    public float width;
    public float height;

    public float offsetX;
    public float offsetY;

    public Color tint = new Color(Color.WHITE);

    public void reset() {
        offsetX = 0;
        offsetY = 0;
    }

    public void set(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width =width;
        this.height=height;
    }
}
