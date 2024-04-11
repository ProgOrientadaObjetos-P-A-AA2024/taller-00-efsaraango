/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Mensaje;
import paquete4.Palabra;
import paquete3.Informacion;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String mensaje = Mensaje.obtenerMensaje();
        /* obtenemos la informacion que
       esta dentro del metodo "obtenerMensaje" q esta en la clase Mensaje */
        int habitantes = Informacion.obtenerHabitantes();
        String cadenaFinal = String.format(mensaje + " con " + habitantes + "\n");
        Scanner leer = new Scanner(System.in);
        System.out.println("Quiere ver el mensaje ingrese numeros del 1 al 5: "
                + "Caso contrario se presentara en mayusculas");
        int valor = leer.nextInt();

        

        if (valor >= 1 && valor <= 5) {
            System.out.printf("%s \n", cadenaFinal);
        } else {
            System.out.printf("%s \n", cadenaFinal.toLowerCase());
        }

    }

}
