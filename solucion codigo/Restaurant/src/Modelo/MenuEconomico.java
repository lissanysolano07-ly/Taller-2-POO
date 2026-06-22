
package Modelo;


public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato,double valorInicial,double porcentajeDescuento) {

        super(nombrePlato, valorInicial);
        this.porcentajeDescuento = porcentajeDescuento;

        calcularMenu();
    }

    @Override
    public void calcularMenu() {

        valorMenu = valorInicial -
                (valorInicial * porcentajeDescuento / 100);
    }

    @Override
    public String toString() {

        return "\n=== Menu economico ===" + "\nNombre Plato: " + nombrePlato + "\nValor Inicial: $" + valorInicial
                +"\nPorcentaje Descuento: " + porcentajeDescuento + "%" +"\nValor Menu: $" + valorMenu;
    }
}