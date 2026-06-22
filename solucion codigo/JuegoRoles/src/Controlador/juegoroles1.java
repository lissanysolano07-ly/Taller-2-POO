
package Controlador;
import Modelo.Personajes;
public class juegoroles1 { 
    public String iniciarCombate(Personajes p1, Personajes p2) {

        while (p1.estaVivo() && p2.estaVivo()) {

            int dano1 = p1.atacar();
            p2.defender(dano1);

            if (!p2.estaVivo()) {
                break;
            }

            int dano2 = p2.atacar();
            p1.defender(dano2);
        }

        if (p1.estaVivo()) {
            p1.subirNivel();
            return "Ganador: " + p1.getNombre();
        } else {
            p2.subirNivel();
            return "Ganador: " + p2.getNombre();
        }
    }
}
