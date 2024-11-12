package Principal;

import Dominio.Catalogo;
import Interfaz.Menu;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Menu menu = new Menu(catalogo);
        menu.mostrarMenu();
    }

}
