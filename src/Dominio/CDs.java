package Dominio;

public class CDs {
    private String nombre;
    private String año;
    private String genero;
    private double precio;

    public CDs(String nombre, String año, String genero, double precio) {
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null) {
            throw new IllegalArgumentException("Error: El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }
    public String getAño(){
        return año;
    }
    public void setAño(String año){

    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){

    }
    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        if (precio <= 0) {
            throw new IllegalArgumentException("Error: El precio no puede ser menor que 0");
        }
        this.precio = precio;
    }
    public String toString(){
        return String.format("CDs{nombre='%s', año='%d', genero='%s', precio=%.2f}",
                nombre, año, genero, precio);
    }
}
