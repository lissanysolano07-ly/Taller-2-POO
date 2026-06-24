package Modelo;

public class Envenenado extends EstadoAlterado {
    private int turnosRestantes;
    private int danoPorTurno;

    public Envenenado(int turnos, int dano) {
        this.turnosRestantes = turnos;
        this.danoPorTurno = dano;
    }

    @Override
    public void aplicar(Personajes personaje) {
        if (turnosRestantes > 0) {
            System.out.println("  [VENENO] " + personaje.getNombre() + " pierde " + danoPorTurno + " de vida!");
            personaje.recibirDanoDirecto(danoPorTurno);
            turnosRestantes--;
        }
    }

    @Override
    public boolean haTerminado() {
        return turnosRestantes <= 0;
    }

    @Override
    public String getNombre() {
        return "Envenenado";
    }
}