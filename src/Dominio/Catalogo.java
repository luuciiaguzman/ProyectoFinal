package Dominio;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<CDs> listaCDs;

    public Catalogo() {
        this.listaCDs = new ArrayList<>();
    }

    public void añadirCDs(CDs cd) {
        listaCDs.add(cd);
        System.out.println(".");
    }

    public List<CDs> getListaCDs() {
        return listaCDs;
    }

    public boolean añadirCDsPorNombre(CDs CDs) {
        if (CDs != null && !existeCDsPorNombre(CDs.getNombre())) {
            listaCDs.add(CDs);
            System.out.println("CD añadido: " + CDs.getNombre());
            return true; // Se añadió correctamente
        }
        System.out.println("Ya existe un software con el nombre: " + CDs.getNombre());
        return false;
    }

    private boolean existeCDsPorNombre(String nombre) {
        for (CDs s : listaCDs) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean esNombreUnico(String nombre) {
        for (CDs CDs : listaCDs) {
            if (CDs.getNombre() == nombre) {
                return false;
            }
        }
        return true;
    }

    private CDs buscarCDsPorNombre(String nombre) {
        for (CDs cd : listaCDs) {
            if (cd.getNombre().equalsIgnoreCase(nombre)) {
                return cd;
            }
        }
        return null;
    }

    public void listarCDs() {
        if (listaCDs.isEmpty()) {
            System.out.println("No hay CDs en el catálogo.");
        } else {
            System.out.println("Lista de CDs:");
            for (CDs CDs : listaCDs) {
                System.out.println(CDs);
            }
        }
    }

    public boolean modificarCDs(String nombre, CDs nuevoCDs) {
        CDs CDsExistente = buscarCDsPorNombre(nombre); // Busca el CD por nombre
        if (CDsExistente != null) {
            CDsExistente.setNombre(nuevoCDs.getNombre());
            CDsExistente.setGenero(nuevoCDs.getGenero());
            CDsExistente.setAño(nuevoCDs.getAño());
            CDsExistente.setPrecio(nuevoCDs.getPrecio());
            System.out.println("CD modificado: " + CDsExistente.getNombre());
            return true;
        }
        System.out.println("CD con nombre '" + nombre + "' no encontrado.");
        return false;
    }
}

