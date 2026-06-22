
package Modelo;

public class Menudia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public Menudia(String nombrePlato, double valorInicial,double valorPostre,double valorBebida) {

        super(nombrePlato, valorInicial);

        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;

        calcularMenu();
    }

    @Override
    public void calcularMenu() {

        valorMenu = valorInicial+ valorPostre+ valorBebida;
    }

    @Override
    public String toString() {
        return "\n=== Menu del dia===" +"\nNombre Plato: " + nombrePlato +  "\nValor Inicial: $" + valorInicial +
           "\nValor Postre: $" + valorPostre +"\nValor Bebida: $" + valorBebida +"\nValor Menu: $" + valorMenu;
    }
}