/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosochoa;

import java.util.ArrayList;

/**
 *
 * @author Carlos Antonio
 */
public class Club {
    private String nombre;
    private String ciudad;
    private Entrenador entrenador;
    private ArrayList<Persona> plantel = new ArrayList<>();

    public Club(String nombre, String ciudad, Entrenador entrenador) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Persona> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Persona> plantel) {
        this.plantel = plantel;
    }
    //metodos de gestion
    public void agregarJugador(){
        
    }
    
    public void buscarDorsal(){
        
    }
    
    public void listarPlantel(){
        
    }
    
    //metodos de estadistica
    
    public void calcularNomina(){
        
    }
    
    public void maximoGoleador(){
        
    }
    
    public void maximoasistidor(){
        
    }
    
    public void mejorPortero(){
        
    }
    
}
