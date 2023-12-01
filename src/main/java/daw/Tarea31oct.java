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
public class Tarea31oct {
    // Pedir al usuario un número de animales que van a ser evaluados en el
    //veterinario. De cada animal vamos a guardar su peso, que vamos a pedir por
    //teclado. Una vez sepamos los pesos de todos los animales, queremos saber 
    //la media de todos los pesos, cuantos animales hay por debajo de la media y
    //cuantos por encima
    //Si el suuario pone un peso negativo se considerará positivo
    //añadir array con nombres opcional

    public static void main(String[] args) {
        double media;

        int numeroAnimales = entradaInt("cuantos animales hay que pesar?");
        System.out.println("numero animales es : " + numeroAnimales);

        double[] arrayPesos = new double[numeroAnimales];
        String[] arrayNombre = new String[numeroAnimales];

        rellenarArray(arrayPesos, arrayNombre);

        
        double totalPeso= totalPeso(arrayPesos);
        media = mediaPesos(totalPeso, numeroAnimales);
        mostrarPesoNombre(arrayPesos, arrayNombre);
        System.out.println("la media es : " + media);
        mostrarPerroBajoMedia(arrayPesos, media, arrayNombre);

    }

    public static int entradaInt(String texto) {
        int salida = 0;
        boolean repetir = true;
        Scanner entradaTexto = new Scanner(System.in);
        do {
            System.out.println(texto);
            try {
                salida = entradaTexto.nextInt();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("introduce un numero valido");
                entradaTexto.nextLine();
            }

        } while (repetir);

        return salida;
    }

    public static double entradaDouble(String texto) {
        double salida = 0;
        boolean repetir = true;
        Scanner entradaTexto = new Scanner(System.in);
        do {
            System.out.println(texto);
            try {
                salida = entradaTexto.nextDouble();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("introduce un numero valido");
                entradaTexto.nextLine();
            }

        } while (repetir);

        return salida;
    }

    public static String entradaTexto(String texto) {
        String salida = " ";
        boolean repetir = true;
        Scanner entradaTexto = new Scanner(System.in);
        do {
            System.out.println(texto);
            try {
                salida = entradaTexto.nextLine();
                repetir = false;
            } catch (InputMismatchException ime) {
                System.out.println("introduce un numero valido");
                entradaTexto.nextLine();
            }

        } while (repetir);

        return salida;
    }



    public static void rellenarArray(double[] arrayPesos, String[] arrayNombre) {
        for (int i = 0; i < arrayPesos.length; i++) {
            arrayNombre[i] = entradaTexto("como se llama el perro?");
            arrayPesos[i] = entradaDouble("cuanto pesa el perro " + arrayNombre[i]);

        }
    }

    public static void mostrarPesoNombre (double[] arrayPesos, String[] arrayNombre ){
         double totalPeso =0;
        
        for (int i = 0; i < arrayPesos.length; i++) {
            System.out.println("el perro  " + arrayNombre[i] + " pesa " + arrayPesos[i]);
            totalPeso = totalPeso + arrayPesos[i];
            
        }
        System.out.println("El total de peso es: "+ totalPeso);
    }
    public static double totalPeso(double[] arrayPesos){
        
            double totalPeso=0;
        for (int i = 0; i < arrayPesos.length; i++) {
            
            totalPeso = totalPeso + arrayPesos[i];
           
    }return totalPeso;
    }
        
        
    public static double mediaPesos(double totalPeso,  int numeroAnimales) {
       
        double media;
        
        media = totalPeso / numeroAnimales;
        return media;
    }
    public static void mostrarPerroBajoMedia (double[] arrayPesos,double media, String[] arrayStrings){
        
        for (int i=0;i<arrayPesos.length;i++){ 
        if(arrayPesos[i]<media){
            System.out.println("el perro " + arrayStrings[i] +" pesa menos que la media");
         
                
        }else{
            System.out.println("el perro " + arrayStrings[i] +" pesa mas que la media");
        }
        
    }
        
    }

}
