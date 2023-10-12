package modelo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends GameObject {

    public String path = "D:\\\\Universidad\\\\semestre 6\\\\Patrones\\\\Contra\\\\Contra\\\\src\\\\img\\\\personaje.png";

    public Player(BufferedImage texture, Vector2D position) {
        super(texture, position);
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int) position.getY(),40,40, null);
    }

}
