package Principal;

import Dominio.Catalogo;
import Interfaz.Menu;

import javax.xml.catalog.CatalogException;

public class Main {
    public static void main(String[] args) {
        try {
            Catalogo catalogo = new Catalogo();
            Menu menu = new Menu(catalogo);
            menu.mostrarMenu();
        } catch (CatalogException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
