package org.example;
import java.util.Scanner;

public class Habitats {
    double temperatura;
    double humedad;
    double area;
    public Habitats() {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.area = area;
    }
    public void mostrarHabitat() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Area: " + area);
    }

}
class Acuatico extends Habitats {

}

class Terrestre extends Habitats {

}

class Aereo extends Habitats {

}
