
package Modelo;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
    }

    public abstract void calcularMenu();

    public double getValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return "\nPlato: " + nombrePlato +"\nValor Menú: $" + valorMenu;
    }
}