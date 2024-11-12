package Interfaz;

import Dominio.Catalogo;
import Dominio.CDs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Catalogo catalogo;
    private final Scanner scanner;

    public Menu(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.scanner = new Scanner(System.in);
    }

    private static final String M_ENTRADA = "Por favor, ingrese un nombre";
    private static final String P_MENOR_CERO = "El precio no puede ser menor que 0";
    private static final String NO_ENCONTRADO = "El CD no ha sido encontrado";

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("        Menú   ");
            System.out.println("     Añadir CD   ");
            System.out.println(" Listar lista de CDs  ");
            System.out.println("    Eliminar CD   ");
            System.out.println("    Modificar CD   ");
            System.out.println("      Salir     ");
            System.out.println("     Buscar");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        añadirCDs();
                        break;
                    case 2:
                        listarCDs();
                        break;
                    case 3:
                        eliminarCDs();
                        break;
                    case 4:
                        modificarCDs();
                        break;
                    case 0:
                        salir();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println(M_ENTRADA);
                scanner.next();
                opcion = -1;
            }
        } while (opcion != 0);
    }

    public void añadirCDs() {
    }

    public void listarCDs() {

    }

    public void eliminarCDs() {

    }

    public void modificarCDs() {

    }

    public void salir() {

    }


}
