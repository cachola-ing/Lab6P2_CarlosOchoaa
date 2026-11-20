/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosochoa;

/**
 *
 * @author Carlos Antonio
 */
public class Entrenador extends Persona {
    private int experiencia;
    private String Formacion;

    public Entrenador(int experiencia, String Formacion, String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
        this.experiencia = experiencia;
        this.Formacion = Formacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacion() {
        return Formacion;
    }

    public void setFormacion(String Formacion) {
        this.Formacion = Formacion;
    }
    
    @Override
    public void calcularSalario(){
        
    }
    
    @Override
    public void mostrarFicha(){
        
    }
}
