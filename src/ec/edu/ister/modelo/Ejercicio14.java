package ec.edu.ister.modelo;

import javax.swing.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Ejercicio14 {
    float promedio;
    String codigo,nombre;
    public void ingresoDatos(){
        
        nombre=JOptionPane.showInputDialog("Ingrese Nombre del Alumno ");
        codigo=JOptionPane.showInputDialog("Ingrese Codigo del Alumno ");
    }
    public float promedio (){
        float nota1 = 0,nota2 = 0,nota3 = 0;
        
        nota1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
        nota2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));    
        nota3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota"));
        
        promedio = (nota1+nota2+(nota3*2))/4;
        
        return promedio;
                
    }
    public void imprimir(){
        ingresoDatos();
        promedio ();
        JOptionPane.showMessageDialog(null,"Nombre: " +nombre + "\nCodigo: " +codigo);
        JOptionPane.showMessageDialog(null,"\nNombre: " +nombre + "\nPromedio: " +promedio);
        
        
    }
    

}
