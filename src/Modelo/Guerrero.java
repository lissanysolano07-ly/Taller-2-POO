
package Modelo;

public class Guerrero extends Personajes{
  private int fuerza;

    public Guerrero(int fuerza, String nombre, int vida, int nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return ataque + fuerza;
    }

    @Override
    public String toString() {
        return "\nGuerrero" +super.toString() +"\nFuerza: " + fuerza;
    }
}