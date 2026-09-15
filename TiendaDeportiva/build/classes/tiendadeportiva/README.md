# Proyecto: Relación N-aria en Java

Este proyecto implementa una **relación N-aria** utilizando Programación Orientada a Objetos en Java.

## Estructura de Clases

La relación N-aria se concreta a través de la clase asociativa `DetalleVenta`, la cual conecta tres entidades principales del sistema en un solo punto:

- **`DetalleVenta`**: Clase asociativa que conecta `Venta`, `Articulo` y `TiendaDeportiva`.
- **`Venta`**: Almacena los datos de la transacción (fecha y cliente).
- **`Articulo`**: Almacena los productos (nombre y precio).
- **`TiendaDeportiva`**: Representa la sede donde se realiza el movimiento.
- **`Principal`**: Clase ejecutable con el método `main` para probar la lógica del sistema.

## Ejecución
Para ejecutar el proyecto en NetBeans, abre la clase `Principal.java` y presiona `Shift + F6`.