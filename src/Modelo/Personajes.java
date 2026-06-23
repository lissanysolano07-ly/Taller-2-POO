package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Personajes {

    protected String nombre;
    protected int vida;
    protected int vidaBase;
    protected int nivel;
    protected int ataque;
    protected int defensa;
    protected List<EstadoAlterado> estados = new ArrayList<>();

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

    public void recibirDanoDirecto(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public void modificarAtaque(int cantidad) {
        ataque += cantidad;
    }

    public void agregarEstado(EstadoAlterado estado) {
        estados.add(estado);
        System.out.println("  >> " + nombre + " recibe el estado: " + estado.getNombre());
    }

    public void aplicarEstados() {
        Iterator<EstadoAlterado> it = estados.iterator();
        while (it.hasNext()) {
            EstadoAlterado estado = it.next();
            estado.aplicar(this);
            if (estado.haTerminado()) {
                System.out.println("  >> Estado [" + estado.getNombre() + "] ha expirado en " + nombre);
                it.remove();
            }
        }
    }

    public boolean estaCongelado() {
        for (EstadoAlterado e : estados) {
            if (e instanceof Congelado && ((Congelado) e).estaActivo()) {
                return true;
            }
        }
        return false;
    }

    public void subirNivel() {
        nivel++;
        ataque += 5;
        defensa += 3;
    }

    public void restaurarVida() {
        vida = vidaBase + ((nivel - 1) * 20);
        estados.clear();
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
        return "\nNombre: " + nombre + "\nVida: " + vida + "\nNivel: " + nivel
                + "\nAtaque: " + ataque + "\nDefensa: " + defensa;
    }
}