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
    public String Nombre;
    public String Seccion;

    //Constructor no parametrizado
    public Libro() {
    }

    //Constructor parametrizado
    public Libro(String Nombre, String Seccion) {
        this.Nombre = Nombre;
        this.Seccion = Seccion;
    }

    //Setters y getters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return Seccion;
    }

    public void setArea(String Area) {
        this.Seccion = Area;
    }

}
