/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete4.Palabra;
import paquete3.Informacion;

/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje= Mensaje.obtenerMensaje(); /* obtenemos la informacion que
       esta dentro del metodo "obtenerMensaje" q esta en la clase Mensaje */
       System.out.printf(mensaje+ " con " + Informacion.obtenerHabitantes()+"\n");
        // usar printf;
    }
    
}
