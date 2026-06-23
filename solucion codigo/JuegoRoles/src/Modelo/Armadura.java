package Modelo;

public class Armadura extends Objeto {

    private int bonoDefensa;

    public Armadura(String nombre, int bonoDefensa) {
        super(nombre);
        this.bonoDefensa = bonoDefensa;
    }

    public int getBonoDefensa() {
        return bonoDefensa;
    }

    @Override
    public String toString() {
        return nombre + " +" + bonoDefensa + " defensa";
    }
}