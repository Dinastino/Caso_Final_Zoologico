package org.example;
import java.util.Scanner;

public class Habitats {
    double temperatura;
    double humedad;
    double area;


}
class Acuatico extends Habitats {
    public int Acuatico() {
        Habitats acuatico = new Habitats();
        System.out.println("Temperatura: " + acuatico.temperatura);
        System.out.println("Humedad: " + acuatico.humedad);
        System.out.println("Area: " + acuatico.area);
        return 0;
    }
}

class Terrestre extends Habitats {
    public Terrestre() {

    }
}

class Aereo extends Habitats {
    public Aereo() {

    }
}
