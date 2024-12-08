package Excepciones;

public class ExcepcionCatalogo extends RuntimeException {
    public ExcepcionCatalogo(String message) {
        super(message);
    }

    public ExcepcionCatalogo(String message, Throwable cause) {
        super(message, cause);
    }
}
