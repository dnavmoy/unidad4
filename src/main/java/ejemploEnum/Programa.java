/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploEnum;

import java.time.Month;

/**
 *
 * @author daniel
 */
public class Programa {

    public static void main(String[] args) {

        PartesDia dia;

        dia = PartesDia.MADRUGADA;

        System.out.println(dia);
        System.out.println(PartesDia.NOCHE.getNombre());
        System.out.println("la tarde tiene como nombre " + PartesDia.TARDE.getNombre());
        System.out.println("la tarde empieza a : " + PartesDia.TARDE.getHoraInicio());

        //el metodo values de los enum devuelve un array con todos los enum
        PartesDia[] todasLasPartes = PartesDia.values();

        for (int i = 0; i < todasLasPartes.length; i++) {
            System.out.println(todasLasPartes[i]);
            
            
        }
        
        Comedor nuevo = new Comedor("ies mar de albora", 4, PartesDia.MAÑANA);
        
        System.out.println("el comedor " + nuevo.getNombre() + " comienza su servicio a las " + nuevo.getHorario().getHoraInicio());
        
    }

}


