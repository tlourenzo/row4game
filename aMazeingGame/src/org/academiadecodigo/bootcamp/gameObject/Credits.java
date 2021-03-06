package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 12/02/17.
 */
public class Credits {
    private SimpleGfxGridPosition position;
    private Picture picture;

    public Credits(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        picture = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "resources/Credits/Credits.png");
        picture.draw();
    }

    public SimpleGfxGridPosition getPos() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }

    public Picture getPicture() {
        return picture;
    }
}
