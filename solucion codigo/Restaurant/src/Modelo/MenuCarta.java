
package Modelo;

public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nombrePlato, double valorInicial,double valorGuarnicion,double valorBebida,double porcentajeServicio) {

        super(nombrePlato, valorInicial);

        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeServicio = porcentajeServicio;

        calcularMenu();
    }

    @Override
    public void calcularMenu() {

        valorMenu = valorInicial + valorGuarnicion+ valorBebida+ (valorInicial * porcentajeServicio / 100);
    }

    @Override
    public String toString() {
        return "\n=== Menu Carta ==="+ "\nNombre Plato: " + nombrePlato + "\nValor Inicial: $" + valorInicial +
           "\nValor Guarnicion: $" + valorGuarnicion + "\nValor Bebida: $" + valorBebida +
           "\nPorcentaje Servicio: " + porcentajeServicio + "%" + "\nValor Menu: $" + valorMenu;
    }
}