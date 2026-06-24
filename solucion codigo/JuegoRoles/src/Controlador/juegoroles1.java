package Controlador;

import Modelo.Personajes;
import Modelo.Envenenado;
import Modelo.Congelado;
import Modelo.AumentarFuerza;
import java.util.Random;

public class juegoroles1 {

    public String iniciarCombate(Personajes p1, Personajes p2) {
        Random rand = new Random();
        int turno = 1;

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            System.out.println("[Estados de " + p1.getNombre() + "]");
            p1.aplicarEstados();
            if (!p1.estaVivo()) break;

            System.out.println("[Estados de " + p2.getNombre() + "]");
            p2.aplicarEstados();
            if (!p2.estaVivo()) break;

            if (!p1.estaCongelado()) {
                int dano1 = p1.atacar();
                System.out.println(p1.getNombre() + " ataca con " + dano1 + " de daño.");
                p2.defender(dano1);
                aplicarEstadoAleatorio(p2, rand);
            }

            if (!p2.estaVivo()) break;

            if (!p2.estaCongelado()) {
                int dano2 = p2.atacar();
                System.out.println(p2.getNombre() + " ataca con " + dano2 + " de daño.");
                p1.defender(dano2);
                aplicarEstadoAleatorio(p1, rand);
            }

            turno++;
        }

        if (p1.estaVivo()) {
            p1.subirNivel();
            return "Ganador: " + p1.getNombre();
        } else {
            p2.subirNivel();
            return "Ganador: " + p2.getNombre();
        }
    }

    private void aplicarEstadoAleatorio(Personajes objetivo, Random rand) {
        int chance = rand.nextInt(100);
        if (chance < 30) {
            int tipo = rand.nextInt(3);
            switch (tipo) {
                case 0:
                    objetivo.agregarEstado(new Envenenado(3, 5));
                    break;
                case 1:
                    objetivo.agregarEstado(new Congelado(1));
                    break;
                case 2:
                    objetivo.agregarEstado(new AumentarFuerza(2, 10));
                    break;
            }
        }
    }
}
