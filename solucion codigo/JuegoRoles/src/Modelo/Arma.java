package Modelo;

public class Arma extends Objeto {

    private int bonoAtaque;

    public Arma(String nombre, int bonoAtaque) {
        super(nombre);
        this.bonoAtaque = bonoAtaque;
    }

    public int getBonoAtaque() {
        return bonoAtaque;
    }

    @Override
    public String toString() {
        return nombre + " +" + bonoAtaque + " ataque";
    }
}