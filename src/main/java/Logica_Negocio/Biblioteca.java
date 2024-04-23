/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author jsml
 */
public class Biblioteca {

    //Declaracion de atributos
    private ArrayList<Libro> Lslibros;

    public static void ordenarPorInsercion(ArrayList<Libro> Lslibros) {
        for (int i = 1; i < Lslibros.size(); i++) {
            boolean agregado = false;
            for (int j = i; j > 0 && !agregado; j--) {
                Libro uno = Lslibros.get(j);
                Libro dos = Lslibros.get(j - 1);
                if (uno.Titulo.compareTo(dos.Titulo) < 0) {
                    Lslibros.set(j, dos);
                    Lslibros.set(j - 1, uno);
                } else {
                    agregado = true;
                }
            }
        }
    }

    public static void MostrarLibros(ArrayList<Libro> Lslibros) {
        System.out.println("Libros ordenados:");
        for (int i = 0; i < Lslibros.size(); i++) {
            System.out.println("Nombre: " + Lslibros.get(i).getTitulo());
            System.out.println("Seccion: " + Lslibros.get(i).getSeccion());
            System.out.println("\n");

        }
    }
}
