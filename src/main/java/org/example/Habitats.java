package org.example;
import java.util.Scanner;

public class Habitats {
    public Habitats() {
        Scanner scanner = new Scanner(System.in);
        String tipo;
        String habitat;

        System.out.println("Ingrese el tipo de habitat: ");
        tipo = scanner.nextLine();

        switch (tipo) {
            case "terrestre":
                System.out.println("Habitat terrestre");
                habitat = "terrestre";
                break;
            case "acuatico":
                System.out.println("Habitat acuatico");
                habitat = "acuatico";
                break;
            case "aereo":
                System.out.println("Habitat aereo");
                habitat = "aereo";
                break;
            default:
                System.out.println("Habitat desconocido");
                break;
        }

    }

    public int LmpiezaHabitat() {

        return 0;
    }
}
