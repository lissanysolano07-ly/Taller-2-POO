package Modelo;

public abstract class Personajes {

    protected String nombre;
    protected int vida;
    protected int vidaBase;
    protected int nivel;
    protected int ataque;
    protected int defensa;
    protected Arma arma;
    protected Armadura armadura;

    public Personajes(String nombre, int vida, int nivel, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaBase = vida;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public abstract int atacar();
    public int calcularAtaque(){

    int total = ataque;

    if(arma != null){
        total += arma.getBonoAtaque();
    }

    return total;
}
public int calcularDefensa(){

    int total = defensa;

    if(armadura != null){
        total += armadura.getBonoDefensa();
    }

    return total;
}
    public void defender(int danio) {

        int danioRecibido = danio - calcularDefensa();

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
    public void equiparArma(Arma arma){
    this.arma = arma;
    }

    public void equiparArmadura(Armadura armadura){
        this.armadura = armadura;
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

    String nombreArma;
    String nombreArmadura;

    if (arma != null) {
        nombreArma = arma.toString();
    } else {
        nombreArma = "Sin arma";
    }

    if (armadura != null) {
        nombreArmadura = armadura.toString();
    } else {
        nombreArmadura = "Sin armadura";
    }

    return "\nNombre: " + nombre
            + "\nVida: " + vida
            + "\nNivel: " + nivel
            + "\nAtaque: " + calcularAtaque()
            + "\nDefensa: " + calcularDefensa()
            + "\nArma: " + nombreArma
            + "\nArmadura: " + nombreArmadura;
}
}