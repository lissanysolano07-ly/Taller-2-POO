
package Modelo;


    public class AumentarFuerza extends EstadoAlterado {
    private int turnosRestantes;
    private int bonusAtaque;
    private boolean aplicado = false;

    public AumentarFuerza(int turnos, int bonus) {
        this.turnosRestantes = turnos;
        this.bonusAtaque = bonus;
    }

    @Override
    public void aplicar(Personajes personaje) {
        if (!aplicado && turnosRestantes > 0) {
            System.out.println("  [FUERZA+] " + personaje.getNombre() + " gana +" + bonusAtaque + " de ataque!");
            personaje.modificarAtaque(bonusAtaque);
            aplicado = true;
        }
        turnosRestantes--;

        if (haTerminado() && aplicado) {
            System.out.println("  [FUERZA+] El bonus de ataque de " + personaje.getNombre() + " ha expirado.");
            personaje.modificarAtaque(-bonusAtaque);
        }
    }

    @Override
    public boolean haTerminado() {
        return turnosRestantes <= 0;
    }

    @Override
    public String getNombre() { return "AumentarFuerza"; }
}

