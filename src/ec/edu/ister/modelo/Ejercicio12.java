/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.*;

/**
 *
 * @author Cristian David Calle Muñoz 
            Instituto Tecnoligico Rumuñahui 
            Cuarto Sistemas
 */
public class Ejercicio12 {
    public void calcular(){
        int hora,minuto,segundo;
        hora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas "));
        minuto = 60;
        segundo = 3600;
        JOptionPane.showMessageDialog(null,"El equivalente en minutos es : " +minuto*hora +"\nEl equivalente en segundos es: " +segundo*hora);
        
    }

}
