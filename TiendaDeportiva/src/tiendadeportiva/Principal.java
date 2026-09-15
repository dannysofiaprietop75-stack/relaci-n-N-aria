package tiendadeportiva;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        TiendaDeportiva sedeNorte = new TiendaDeportiva("Deportes Alfa", "Sede Norte");
        Venta venta1 = new Venta("15/09/2026", "Danna Prieto");
        
        Articulo art1 = new Articulo("Balón de Fútbol", 50000.0);
        Articulo art2 = new Articulo("Camiseta Deportiva", 35000.0);

        List<DetalleVenta> detalles = new ArrayList<>();
        detalles.add(new DetalleVenta(venta1, art1, sedeNorte, 2));
        detalles.add(new DetalleVenta(venta1, art2, sedeNorte, 1));

        System.out.println("=== REGISTRO DE VENTA N-ARIA ===");
        System.out.println("Tienda: " + sedeNorte.getNombre() + " (" + sedeNorte.getSede() + ")");
        System.out.println("Cliente: " + venta1.getCliente() + " | Fecha: " + venta1.getFecha());
        System.out.println("--------------------------------------------------");

        double total = 0;
        for (DetalleVenta detalle : detalles) {
            double subtotal = detalle.calcularSubtotal();
            total += subtotal;
            System.out.println("Artículo: " + detalle.getArticulo().getNombre() + 
                               " | Cantidad: " + detalle.getCantidad() + 
                               " | Subtotal: $" + subtotal);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
    }
}