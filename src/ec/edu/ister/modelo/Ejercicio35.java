package ec.edu.ister.modelo;

import javax.swing.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Ejercicio35 {
    float producto,ptotal;
    public float articulo(){
        producto=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del articulo:"));
        
        producto = producto*1.19f;
        JOptionPane.showMessageDialog(null,"Valor total del articulo" +producto);
        return producto;
    }
    
}
