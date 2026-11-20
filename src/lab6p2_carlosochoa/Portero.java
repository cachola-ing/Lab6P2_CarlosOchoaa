/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosochoa;

/**
 *
 * @author Carlos Antonio
 */
public class Portero extends Jugador{
    private int atajadas;
    private int golesRecibidos;

    public Portero(int atajadas, int golesRecibidos, int dorsal, String posicion, int goles, int asistencias, int tAmarilla, int tRoja, boolean suspendido, String nombre, int edad, double salarioBase) {
        super(dorsal, posicion, goles, asistencias, tAmarilla, tRoja, suspendido, nombre, edad, salarioBase);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    
    public void registrarAtajadas(){
        atajadas++;
        
    }
    public void recibirGol(){
        
    }
    
    
}
