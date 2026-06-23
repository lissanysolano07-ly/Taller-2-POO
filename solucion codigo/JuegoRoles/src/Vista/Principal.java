package Vista;
import Modelo.Arma;
import Modelo.Armadura;
import Controlador.juegoroles1;
import Modelo.Arquero;
import Modelo.Guerrero;
import Modelo.Mago;
import Modelo.Personajes;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op1, op2;

        System.out.println("=== PERSONAJE 1 ===");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        op1 = sc.nextInt();

        Personajes p1;

        switch (op1) {
            case 1:
                p1 = new Guerrero(20, "Guerrero", 100, 1, 15, 10);
                break;
            case 2:
                p1 = new Mago(25, "Mago", 80, 1, 15, 8);
                break;
            default:
                p1 = new Arquero(18, "Arquero", 90, 1, 14, 9);
                break;
        }

        do {
            System.out.println("\n=== PERSONAJE 2 ===");
            System.out.println("1. Guerrero");
            System.out.println("2. Mago");
            System.out.println("3. Arquero");

            op2 = sc.nextInt();

            if (op1 == op2) {
                System.out.println("No se permiten combates entre personajes del mismo tipo.");
            }

        } while (op1 == op2);

        Personajes p2;

        switch (op2) {
            case 1:
                p2 = new Guerrero(20, "Guerrero", 100, 1, 15, 10);
                break;
            case 2:
                p2 = new Mago(25, "Mago", 80, 1, 15, 8);
                break;
            default:
                p2 = new Arquero(18, "Arquero", 90, 1, 14, 9);
                break;
        }
        Arma espada = new Arma("Espada Legendaria", 10);
        Armadura escudo = new Armadura("Escudo Real", 5);

        p1.equiparArma(espada);
        p2.equiparArmadura(escudo);
        juegoroles1 combate = new juegoroles1();

        int continuar;

        do {

            // Restaurar vida antes de cada batalla
            p1.restaurarVida();
            p2.restaurarVida();

            System.out.println("\n========================");
            System.out.println("ESTADO INICIAL");
            System.out.println("========================");

            System.out.println("\nPERSONAJE 1");
            System.out.println(p1);

            System.out.println("\nPERSONAJE 2");
            System.out.println(p2);

            String resultado = combate.iniciarCombate(p1, p2);

            System.out.println("\n" + resultado);

            System.out.println("\n========================");
            System.out.println("ESTADO FINAL");
            System.out.println("========================");

            System.out.println("\nPERSONAJE 1");
            System.out.println(p1);

            System.out.println("\nPERSONAJE 2");
            System.out.println(p2);

            System.out.println("\n1. Revancha");
            System.out.println("2. Salir");

            continuar = sc.nextInt();

        } while (continuar == 1);

        System.out.println("\nJuego finalizado.");
    }
}