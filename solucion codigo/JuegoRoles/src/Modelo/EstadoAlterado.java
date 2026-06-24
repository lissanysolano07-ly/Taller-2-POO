package Modelo;

public abstract class EstadoAlterado {
    public abstract void aplicar(Personajes personaje);
    public abstract boolean haTerminado();
    public abstract String getNombre();
}