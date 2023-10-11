package vista;

import javax.swing.JFrame;

public class vista extends JFrame{
    
    private final int Width = 900;
    private final int Height = 600;

    public vista(){
        initcomponets();
        setVisible(true);
    }

    public void initcomponets(){
        setTitle("Contra");
        setSize(Width, Height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
