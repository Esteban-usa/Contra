package controlador;

import modelo.GameState;
import modelo.Logica;
import vista.Vista;

public class Controlador {

    private Logica l;
    private Vista v;

    public GameState gameState;
    public KeyBoard keyboard;

    public Controlador(Logica l) {
        this.l = l;
        
        init();
    }

    public void init() {
        gameState = new GameState();
        keyboard = new KeyBoard();
    }

    public Logica getL() {
        return l;
    }

    public void setL(Logica l) {
        this.l = l;
    }

    public Vista getV() {
        return v;
    }

    public void setV(Vista v) {
        this.v = v;
    }
}
