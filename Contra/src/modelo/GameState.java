package modelo;

import java.awt.Graphics;

public class GameState{

    private Player player;
    
    public GameState(){
        player = new Player(Bufferimage.imageLoader("D:\\Universidad\\semestre 6\\Patrones\\Contra\\Contra\\src\\img\\personaje.png"),new Vector2D(100, 200));
    }

    public void update(){

    }

    public void draw(Graphics g){
        player.draw(g);
    }
}
