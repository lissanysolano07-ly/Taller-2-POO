
package Modelo;

public class Arquero extends  Personajes{
    private int precision;
   public Arquero(int precision, String nombre, int vida, int nivel, int ataque, int defensa) {
        super(nombre, vida, nivel, ataque, defensa);
        this.precision = precision;
    }

    @Override
    public int atacar() {
        return calcularAtaque() + precision;
    }
    @Override
    public String toString() {
        return "\nArquero" +super.toString() + "\nPrecision: " + precision;
    
    
    }
}