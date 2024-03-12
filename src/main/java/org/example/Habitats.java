package org.example;

import java.util.Scanner;

public class Habitats {
    double temperatura;
    double humedad;
    double area;

    public Habitats() {
    }

    public Habitats(double temperatura, double humedad, double area) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.area = area;
    }

    public void mostrarHabitat() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Area: " + area);
    }

    public static Habitats crearHabitat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura del habitat: ");
        double temperatura = scanner.nextDouble();
        System.out.println("Ingrese la humedad del habitat: ");
        double humedad = scanner.nextDouble();
        System.out.println("Ingrese el area del habitat: ");
        double area = scanner.nextDouble();
        return new Habitats(temperatura, humedad, area);
    }

}
    class Acuatico extends Habitats {
        double nivelAgua;

        public Acuatico(double temperatura, double humedad, double area, double nivelAgua) {
            super(temperatura, humedad, area);
            this.nivelAgua = nivelAgua;
        }

        public void mostrarCondiciones() {
            super.mostrarHabitat();
            System.out.println("Nivel de agua: " + nivelAgua);
        }
    }

    class Terrestre extends Habitats {
        public Terrestre(double temperatura, double humedad, double area) {
            super(temperatura, humedad, area);
        }

        public void mostrarCondiciones() {
            super.mostrarHabitat();
        }
    }

    class Aereo extends Habitats {
        public Aereo(double temperatura, double humedad, double area) {
            super(temperatura, humedad, area);
            
        }

        public void mostrarCondiciones() {
            super.mostrarHabitat();
        }
    }
