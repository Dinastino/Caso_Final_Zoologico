package org.example;

import java.util.Date;
import java.util.Scanner;

import java.util.Date;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaZoologico sistema = new SistemaZoologico();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear hábitat");
            System.out.println("2. Programar mantenimiento");
            System.out.println("3. Reportar reparación urgente");
            System.out.println("4. Instalar cámara");
            System.out.println("5. Instalar sensor de movimiento");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de hábitat:");
                    System.out.println("1. Acuático");
                    System.out.println("2. Terrestre");
                    System.out.println("3. Aéreo");
                    int tipoHabitat = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    if (tipoHabitat == 1) {
                        System.out.println("Ingrese la temperatura del hábitat:");
                        double temperatura = scanner.nextDouble();
                        System.out.println("Ingrese la humedad del hábitat:");
                        double humedad = scanner.nextDouble();
                        System.out.println("Ingrese el área del hábitat:");
                        double area = scanner.nextDouble();
                        System.out.println("Ingrese el nivel de agua del hábitat:");
                        double nivelAgua = scanner.nextDouble();
                        Acuatico acuatico = new Acuatico(temperatura, humedad, area, nivelAgua);
                        acuatico.mostrarCondiciones();
                    } else if (tipoHabitat == 2) {
                        System.out.println("Ingrese la temperatura del hábitat:");
                        double temperatura = scanner.nextDouble();
                        System.out.println("Ingrese la humedad del hábitat:");
                        double humedad = scanner.nextDouble();
                        System.out.println("Ingrese el área del hábitat:");
                        double area = scanner.nextDouble();
                        Terrestre terrestre = new Terrestre(temperatura, humedad, area);
                        terrestre.mostrarCondiciones();
                    } else if (tipoHabitat == 3) {
                        System.out.println("Ingrese la temperatura del hábitat:");
                        double temperatura = scanner.nextDouble();
                        System.out.println("Ingrese la humedad del hábitat:");
                        double humedad = scanner.nextDouble();
                        System.out.println("Ingrese el área del hábitat:");
                        double area = scanner.nextDouble();
                        Aereo aereo = new Aereo(temperatura, humedad, area);
                        aereo.mostrarCondiciones();
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la tarea de mantenimiento:");
                    String tareaMantenimiento = scanner.nextLine();
                    sistema.programarMantenimiento(tareaMantenimiento, new Date());
                    break;
                case 3:
                    System.out.println("Ingrese la descripción de la reparación urgente:");
                    String descripcionReparacion = scanner.nextLine();
                    sistema.reportarReparacionUrgente(descripcionReparacion, new Date());
                    break;
                case 4:
                    System.out.println("Ingrese la ubicación de la cámara:");
                    String ubicacionCamara = scanner.nextLine();
                    sistema.instalarCamara(ubicacionCamara);
                    break;
                case 5:
                    System.out.println("Ingrese la ubicación del sensor de movimiento:");
                    String ubicacionSensor = scanner.nextLine();
                    sistema.instalarSensorMovimiento(ubicacionSensor);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
