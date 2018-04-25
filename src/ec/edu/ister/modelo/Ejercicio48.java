package ec.edu.ister.modelo;

import javax.swing.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Ejercicio48 {
    float base,altura,area,perimetro;
     public void ingresoRectangulo(){
         base=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del rectangulo:"));
         altura=Float.parseFloat(JOptionPane.showInputDialog("\nIngrese la altura del rectangulo:"));
     }
    public void operacionRectangulo() {
        area=base*altura;
        perimetro=2*(base+altura);
        JOptionPane.showMessageDialog(null,"Area: " +area+ "\nPerimetro: " +perimetro);
    }
    
    

}
