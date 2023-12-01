/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author daniel
 */
public class Unidad4 {

    public static void main(String[] args) {
        
        
        
        System.out.println("introduce el dato menor");
        int menor = Utilidades.solicitarDatoInt();
        System.out.println("introduce el dato mayor");
        int mayor = Utilidades.solicitarDatoInt();
        
        int numero = Utilidades.filtraDatoMenorMayor(menor, mayor);
        
        System.out.println("el numero es : " + numero);
        
    }
}
