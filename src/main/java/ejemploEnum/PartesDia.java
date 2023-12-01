/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejemploEnum;



/**
 *
 * @author daniel
 */
public enum PartesDia {
    //instanciacion de objetos
    MAÑANA("Mañana",7,12),
    TARDE("Tarde",12,20),
    NOCHE("Noche",20,24),
    MADRUGADA("Madrugada",24,7);
    
    
    
    //Definicion de atributos
    private final String nombre;
    private final int horaInicio;
    private final int horaFin;
    
    
    //metodos

    private PartesDia(String nombre, int horaInicio, int horaFin) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartesDia{");
        sb.append("nombre=").append(nombre);
        sb.append(", horaInicio=").append(horaInicio);
        sb.append(", horaFin=").append(horaFin);
        sb.append('}');
        return sb.toString();
    }
    
    
}
