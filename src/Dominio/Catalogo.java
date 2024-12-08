package Dominio;
import java.util.ArrayList;
import java.util.List;
import Excepciones.ExcepcionCatalogo;


public class Catalogo {

    private List<CDs> listaCDs;

    public Catalogo() throws ExcepcionCatalogo {
        this.listaCDs = new ArrayList<>();
        if (listaCDs == null) {
            throw new ExcepcionCatalogo("Se ha producido un error");
        }
    }

    public void añadirCDs(CDs cd) throws ExcepcionCatalogo{
        listaCDs.add(cd);
        System.out.println("CD añadido");
        if (cd == null) {
            throw new ExcepcionCatalogo("Se ha producido un error");
        }
    }

    public List<CDs> getListaCDs() {
        return listaCDs;
    }

    public boolean añadirCDsPorNombre(CDs CDs) {
        if (CDs != null && !existeCDsPorNombre(CDs.getNombre())) {
            listaCDs.add(CDs);
            System.out.println("CD añadido: " + CDs.getNombre());
            return true;
        }
        if (CDs == null) {
            throw new ExcepcionCatalogo("Se ha producido un error");
        }
        if (existeCDsPorNombre(CDs.getNombre())) {
            throw new ExcepcionCatalogo("Ya existe un CD con este nombre");
        }
        listaCDs.add(CDs);
        System.out.println("CD añadido: " + CDs.getNombre());
        return true;

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

