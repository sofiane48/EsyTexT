package vista;

import java.awt.Color;
import javax.swing.UIManager;

/**
 * 
 * @author Sofiane
 * 
 */

public class Look {
	private static String tituloVentanaPrincipal = "Mi App Genial";
    private static Color colorFondo = new Color(240, 240, 240); // Gris claro
    private static Color colorBoton = new Color(70, 130, 180); // Azul acero

    public static String getTituloVentanaPrincipal() {
        return tituloVentanaPrincipal;
    }

    public static void setTituloVentanaPrincipal(String tituloVentanaPrincipal) {
        Look.tituloVentanaPrincipal = tituloVentanaPrincipal;
    }

    public static Color getColorFondo() {
        return colorFondo;
    }

    public static void setColorFondo(Color colorFondo) {
        Look.colorFondo = colorFondo;
    }

    public static Color getColorBoton() {
        return colorBoton;
    }

    public static void setColorBoton(Color colorBoton) {
        Look.colorBoton = colorBoton;
    }

    public static void aplicarEstilo() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
