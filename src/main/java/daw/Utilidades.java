/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Utilidades {
    
    public static int solicitarDatoInt(){
        int numero=0;
        Scanner entradaTeclado = new Scanner (System.in);
        boolean seguir=true;
        
        
        do{
            try{
                System.out.println("Introduce un numero entero");
                numero=entradaTeclado.nextInt();
                
                seguir=false;
            }catch (InputMismatchException ime){
                System.out.println("introduce un numero valido");
                
            }
            entradaTeclado.nextLine();
        }while(seguir);
           
        
     return numero;   
    }
 
    
    public static int filtraDatoMenorMayor(int menor, int mayor){
        int numero =0;
        
        do { 
            numero=Utilidades.solicitarDatoInt();
            if (numero<menor||numero>mayor){
                System.out.println("introduce un numero entre " + menor + " - " + mayor);
            }
            
        }while(numero<menor||numero>mayor);
        
        return numero;
    }
}
