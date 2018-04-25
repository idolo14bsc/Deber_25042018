/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Aplicacion {
    public static void main(String[] args) {
        Ejercicio14 obj = new Ejercicio14();
        obj.ingresoDatos();
        obj.promedio();
        
        
        Ejercicio11 obj2 = new Ejercicio11();
        obj2.ingresoNumeros();
        obj2.operacionesNumeros();
        
        
        Ejercicio48 obj3 = new Ejercicio48();
        obj3.ingresoRectangulo();
        obj3.operacionRectangulo();
         
        
        Ejercicio35 obj4 = new Ejercicio35();
        obj4.articulo();
        
        
        Ejercicio12 obj5 = new Ejercicio12();
        obj5.calcular();
        
    }

}
