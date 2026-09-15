package tiendadeportiva;

public class TiendaDeportiva {
    private String nombre;
    private String sede;

    public TiendaDeportiva(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSede() {
        return sede;
    }
}