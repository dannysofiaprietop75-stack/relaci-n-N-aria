package tiendadeportiva;

public class DetalleVenta {
    private Venta venta;
    private Articulo articulo;
    private TiendaDeportiva tienda;
    private int cantidad;

    public DetalleVenta(Venta venta, Articulo articulo, TiendaDeportiva tienda, int cantidad) {
        this.venta = venta;
        this.articulo = articulo;
        this.tienda = tienda;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return articulo.getPrecio() * cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public TiendaDeportiva getTienda() {
        return tienda;
    }

    public int getCantidad() {
        return cantidad;
    }
}
