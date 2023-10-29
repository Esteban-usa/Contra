package modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import controlador.KeyBoard;


public class Player extends MovingObject {

    private Vector2D heading;
    private Vector2D accelerarion;
    private final double ACC = 0.08;

    public Player(BufferedImage texture, Vector2D position, Vector2D velocity) {
        super(texture, position, velocity);
        heading = new Vector2D(0,1);
        accelerarion = new Vector2D();
    }

    @Override
    public void update() {

        if(KeyBoard.RIGHT){
            heading = heading.setDirection(0);
            accelerarion = heading.scale(ACC);
        }
        if(KeyBoard.LEFT){
            heading = heading.setDirection(Math.PI);
            accelerarion = heading.scale(ACC);
        }
        if(KeyBoard.UP){
            System.out.println("UP");
            
        }

        velocity = velocity.add(accelerarion);
        
        position = position.add(velocity);
    }

    @Override
    public void draw(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        at = AffineTransform.getTranslateInstance(position.getX(), position.getY());

        at.rotate(angle,Bufferimage.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\Contra\\Contra\\src\\img\\personaje.png").getWidth()/2,Bufferimage.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\Contra\\Contra\\src\\img\\personaje.png").getHeight()/2);

        g2d.drawImage(Bufferimage.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\Contra\\Contra\\src\\img\\personaje.png"), at,null);
    }

}
