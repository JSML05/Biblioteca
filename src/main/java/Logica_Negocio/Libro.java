/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author jsml
 */
public class Libro {

    //Declaracion de atributos
    public String Titulo;
    public String Seccion;

    //Constructor no parametrizado
    public Libro() {
    }

    //Constructor parametrizado
    public Libro(String Titulo, String Seccion) {
        this.Titulo = Titulo;
        this.Seccion = Seccion;
    }

    //Setters y getters
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

}
