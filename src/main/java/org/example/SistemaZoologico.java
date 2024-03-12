package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Mantenimiento {
    private String tarea;
    private Date fechaProgramada;

    public Mantenimiento(String tarea, Date fechaProgramada) {
        this.tarea = tarea;
        this.fechaProgramada = fechaProgramada;
    }

    // Getters y Setters
}

class ReparacionUrgente {
    private String descripcion;
    private Date fechaReporte;

    public ReparacionUrgente(String descripcion, Date fechaReporte) {
        this.descripcion = descripcion;
        this.fechaReporte = fechaReporte;
    }

    // Getters y Setters
}

class Camara {
    private String ubicacion;
    private boolean activa;

    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activa = false; // Por defecto, la cámara está desactivada
    }

    public void activar() {
        this.activa = true;
        System.out.println("Cámara activada en " + ubicacion);
    }

    public void desactivar() {
        this.activa = false;
        System.out.println("Cámara desactivada en " + ubicacion);
    }

    // Método para capturar imagen o video
    public void capturar() {
        if (activa) {
            System.out.println("Capturando imagen/video en " + ubicacion);
            // Lógica para capturar imagen o video
        } else {
            System.out.println("La cámara en " + ubicacion + " está desactivada.");
        }
    }
}

class SensorMovimiento {
    private String ubicacion;
    private boolean activo;

    public SensorMovimiento(String ubicacion) {
        this.ubicacion = ubicacion;
        this.activo = false; // Por defecto, el sensor está desactivado
    }

    public void activar() {
        this.activo = true;
        System.out.println("Sensor de movimiento activado en " + ubicacion);
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("Sensor de movimiento desactivado en " + ubicacion);
    }

    // Método para detectar movimiento
    public void detectarMovimiento() {
        if (activo) {
            System.out.println("Movimiento detectado en " + ubicacion);
            // Lógica para notificar sobre el movimiento
        } else {
            System.out.println("El sensor de movimiento en " + ubicacion + " está desactivado.");
        }
    }
}

public class SistemaZoologico {
    private List<Mantenimiento> tareasMantenimiento = new ArrayList<>();
    private List<ReparacionUrgente> reparacionesUrgentes = new ArrayList<>();
    public List<Camara> camaras = new ArrayList<>();
    public List<SensorMovimiento> sensoresMovimiento = new ArrayList<>();

    public void programarMantenimiento(String tarea, Date fechaProgramada) {
        Mantenimiento mantenimiento = new Mantenimiento(tarea, fechaProgramada);
        tareasMantenimiento.add(mantenimiento);
    }

    public void reportarReparacionUrgente(String descripcion, Date fechaReporte) {
        ReparacionUrgente reparacion = new ReparacionUrgente(descripcion, fechaReporte);
        reparacionesUrgentes.add(reparacion);
    }

    public void instalarCamara(String ubicacion) {
        Camara camara = new Camara(ubicacion);
        camaras.add(camara);
    }

    public void instalarSensorMovimiento(String ubicacion) {
        SensorMovimiento sensor = new SensorMovimiento(ubicacion);
        sensoresMovimiento.add(sensor);
    }

}

