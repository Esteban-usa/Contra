package modelo;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public abstract class MovingObject extends GameObject{

    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;

    public MovingObject(BufferedImage texture, Vector2D position, Vector2D velocity) {
        super(texture, position);
        this.velocity = velocity;
        angle = 0;
    }
    
}
