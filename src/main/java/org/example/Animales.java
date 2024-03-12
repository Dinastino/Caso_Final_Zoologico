package org.example;

import java.util.HashMap;
import java.util.Map;

// Clase principal Animal
public class Animales {
    protected String nombre;
    protected int edad;
    protected String tipoAlimentacion;

    public Animales(String nombre, int edad, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo " + tipoAlimentacion);
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }

    public void moverse() {
        System.out.println(nombre + " se está moviendo");
    }

    public void hacerSonido() {
        System.out.println(nombre + " está haciendo un sonido");
    }
}

// Clase específica para Mamíferos
class Mamifero extends Animales {
    protected boolean esNocturno;

    public Mamifero(String nombre, int edad, String tipoAlimentacion, boolean esNocturno) {
        super(nombre, edad, tipoAlimentacion);
        this.esNocturno = esNocturno;
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus crías");
    }
}

// Clase específica para Aves
class Ave extends Animales {
    protected String tipoPlumaje;

    public Ave(String nombre, int edad, String tipoAlimentacion, String tipoPlumaje) {
        super(nombre, edad, tipoAlimentacion);
        this.tipoPlumaje = tipoPlumaje;
    }

    public void volar() {
        System.out.println(nombre + " está volando");
    }
}

// Clase específica para Reptiles
class Reptil extends Animales {
    protected boolean esVeneno;

    public Reptil(String nombre, int edad, String tipoAlimentacion, boolean esVeneno) {
        super(nombre, edad, tipoAlimentacion);
        this.esVeneno = esVeneno;
    }

    public void camuflarse() {
        System.out.println(nombre + " se está camuflando");
    }
}

class RegistroAnimales {
    private Map<String, Animales> animales;

    public RegistroAnimales() {
        animales = new HashMap<>();
    }

    public void agregarAnimal(Animales animal) {
        animales.put(animal.nombre, animal);
    }

    public void alimentarAnimal(String nombreAnimal) {
        if (animales.containsKey(nombreAnimal)) {
            Animales animal = animales.get(nombreAnimal);
            animal.comer();
        } else {
            System.out.println("No se encontró ningún animal con ese nombre.");
        }
    }

    public void revisarSaludAnimal(String nombreAnimal) {
        if (animales.containsKey(nombreAnimal)) {
            Animales animal = animales.get(nombreAnimal);
            System.out.println("La salud de " + animal.nombre + " es buena.");
        } else {
            System.out.println("No se encontró ningún animal con ese nombre.");
        }
    }

    public void observarComportamientoAnimal(String nombreAnimal) {
        if (animales.containsKey(nombreAnimal)) {
            Animales animal = animales.get(nombreAnimal);
            animal.hacerSonido();
            animal.moverse();
            animal.dormir();
        } else {
            System.out.println("No se encontró ningún animal con ese nombre.");
        }
    }
}
