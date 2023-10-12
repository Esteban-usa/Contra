import controlador.Controlador;
import modelo.Logica;
import vista.Vista;

public class Launcher{

    public static void main(String[] args) throws Exception {
        
        Logica l = new Logica();

		Controlador e = new Controlador(l);

		Vista v = new Vista(e);

		e.setV(v);
        
    }
}
