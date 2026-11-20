/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosochoa;

/**
 *
 * @author Carlos Antonio
 */
public class Jugador extends Persona {

    private int dorsal;
    private String posicion;
    private int goles;
    private int asistencias;
    private int tAmarilla;
    private int tRoja;
    private boolean suspendido;

    public Jugador(int dorsal, String posicion, int goles, int asistencias, int tAmarilla, int tRoja, boolean suspendido, String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tAmarilla = tAmarilla;
        this.tRoja = tRoja;
        this.suspendido = suspendido;
    }

    public static void anotarGol() {

    }

    public static void registrarAsistencia() {

    }

    public static void amonestar() {

    }

    public static void expulsar() {

    }

    public static void cumplirSancion() {

    }

    public static void participacionesGol() {

    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void mostrarFicha() {

    }

}
