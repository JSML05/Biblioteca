/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Biblioteca;
import Logica_Negocio.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jsml
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        String Titulo = "";
        String Seccion = "";
        int Num_libros = 0;
        ArrayList<Libro> Lslibros = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        int opc = 0;
        do {
            System.out.println("     Libreria     ");
            System.out.println("1. Registrar libros");
            System.out.println("2. Ordenar libros");
            System.out.println("3. Salir");
            System.out.println("\n");
            System.out.println("Ingrese la opcion");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite el numero de libros a registrar");
                    Num_libros = scan.nextInt();
                    scan.nextLine();

                    for (int i = 0; i < Num_libros; i++) {
                        System.out.println("Digite el titulo del libro " + (i + 1) + " :");
                        Titulo = scan.nextLine();

                        System.out.println("Digite la seccion a la que corresponde : ");
                        Seccion = scan.nextLine();

                        Libro objLibro = new Libro(Titulo, Seccion);
                        Lslibros.add(objLibro);

                    }

                    System.out.println("\n");
                    System.out.println("Libros registrados correctamente : " + Num_libros);
                    System.out.println("\n");

                    break;

                case 2:
                    if (!Lslibros.isEmpty()) {
                        Biblioteca.ordenarPorInsercion(Lslibros);
                        Biblioteca.MostrarLibros(Lslibros);
                    } else {
                        System.out.println("Las estanterias se encuentran vacias");
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    //Salir
                    break;

                default:
                    throw new AssertionError();
            }
        } while (opc != 3);

    }
}
