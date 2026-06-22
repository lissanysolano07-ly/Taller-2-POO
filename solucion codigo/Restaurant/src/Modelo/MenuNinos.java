
package Modelo;

public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombrePlato,double valorInicial,double valorHelado,double valorPastel) {

        super(nombrePlato, valorInicial);

        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;

        calcularMenu();
    }

    @Override
    public void calcularMenu() {

        valorMenu = valorInicial + valorHelado+ valorPastel;
    }

    @Override
    public String toString() {
        return "\n=== Menu de niños ===" +"\nNombre Plato: " + nombrePlato +  "\nValor Inicial: $" + valorInicial +
           "\nValor Helado: $" + valorHelado +"\nValor Pastel: $" + valorPastel +"\nValor Menu: $" + valorMenu;
    }
}