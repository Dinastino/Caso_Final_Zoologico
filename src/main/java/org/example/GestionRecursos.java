package org.example;
import java.util.HashMap;
import java.util.Map;

// Clase para representar un recurso (alimento, medicina, equipamiento)
class Recurso extends GestionRecursos {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

// Clase para manejar los recursos del zoológico
public class GestionRecursos {
    private Map<String, Recurso> inventario;

    public GestionRecursos() {
        inventario = new HashMap<>();
    }

    // Método para añadir un recurso al inventario
    public void agregarRecurso(String nombre, int cantidad) {
        if (inventario.containsKey(nombre)) {
            Recurso recurso = inventario.get(nombre);
            recurso.setCantidad(recurso.getCantidad() + cantidad);
        } else {
            inventario.put(nombre, new Recurso(nombre, cantidad));
        }
    }

    // Método para realizar un pedido de un recurso
    public void hacerPedido(String nombre, int cantidad) {
        if (inventario.containsKey(nombre)) {
            Recurso recurso = inventario.get(nombre);
            if (recurso.getCantidad() >= cantidad) {
                recurso.setCantidad(recurso.getCantidad() - cantidad);
                System.out.println("Pedido realizado: " + cantidad + " " + nombre);
            } else {
                System.out.println("No hay suficiente " + nombre + " en el inventario.");
            }
        } else {
            System.out.println("El recurso " + nombre + " no está en el inventario.");
        }
    }

    // Método para listar todos los recursos en el inventario
    public void mostrarInventario() {
        System.out.println("Inventario del zoológico:");
        for (Recurso recurso : inventario.values()) {
            System.out.println(recurso.getNombre() + ": " + recurso.getCantidad());
        }
    }

    // Método principal para probar el funcionamiento
    public static void main(String[] args) {
        GestionRecursos gestionRecursos = new GestionRecursos();

        // Agregar algunos recursos al inventario
        gestionRecursos.agregarRecurso("Carne", 100);
        gestionRecursos.agregarRecurso("Medicina", 50);
        gestionRecursos.agregarRecurso("Juguetes", 200);

        // Mostrar el inventario
        gestionRecursos.mostrarInventario();

        // Hacer un pedido de recursos
        gestionRecursos.hacerPedido("Carne", 50);

        // Mostrar el inventario después del pedido
        gestionRecursos.mostrarInventario();
    }
}
