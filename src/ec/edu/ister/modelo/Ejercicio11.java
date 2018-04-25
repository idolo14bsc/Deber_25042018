
package ec.edu.ister.modelo;

import javax.swing.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Ejercicio11 {
    static int suma = 0,multiplicacion, numeros[];
    public void ingresoNumeros() {
        numeros = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero:  " + (i + 1)));
        }
    }
    public void operacionesNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
            multiplicacion=numeros[0]*numeros[1]*numeros[2]*numeros[3];
        }
        
        JOptionPane.showMessageDialog(null,"Suma: " +suma + "\nMultiplicacion:" +multiplicacion );
    }
    

}
