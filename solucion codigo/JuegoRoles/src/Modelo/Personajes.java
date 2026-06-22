package Modelo;

public abstract class Personajes {

    protected String nombre;
    protected int vida;
    protected int vidaBase;
    protected int nivel;
    protected int ataque;
    protected int defensa;

    public Personajes(String nombre, int vida, int nivel, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaBase = vida;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public abstract int atacar();

    public void defender(int danio) {

        int danioRecibido = danio - defensa;

        if (danioRecibido < 0) {
            danioRecibido = 0;
        }

        vida -= danioRecibido;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void subirNivel() {

        nivel++;
        ataque += 5;
        defensa += 3;
    }

    public void restaurarVida() {

        vida = vidaBase + ((nivel - 1) * 20);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {

        return "\nNombre: " + nombre+ "\nVida: " + vida + "\nNivel: " + nivel
                + "\nAtaque: " + ataque + "\nDefensa: " + defensa;
    }
}