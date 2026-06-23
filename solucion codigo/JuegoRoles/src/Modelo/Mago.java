
package Modelo;

public class Mago extends Personajes{
    private int magia;
    public Mago(int magia, String nombre, int vida, int nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
        this.magia = magia;
    }
        @Override
    public int atacar() {
        return calcularAtaque() + magia;
    }
    @Override
    public String toString() {
        return "\nMago " +super.toString() +"\nMagia: " + magia;
    }
}   
    
