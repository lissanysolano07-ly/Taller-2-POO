
package Modelo;
public class Congelado extends EstadoAlterado {
    private int turnosRestantes;

    public Congelado(int turnos) {
        this.turnosRestantes = turnos;
    }

    public boolean estaActivo() {
        return turnosRestantes > 0;
    }

    @Override
    public void aplicar(Personajes personaje) {
        if (turnosRestantes > 0) {
            System.out.println("  [CONGELADO] " + personaje.getNombre() + " no puede atacar este turno!");
            turnosRestantes--;
        }
    }

    @Override
    public boolean haTerminado() {
        return turnosRestantes <= 0;
    }

    @Override
    public String getNombre() { return "Congelado"; }
}