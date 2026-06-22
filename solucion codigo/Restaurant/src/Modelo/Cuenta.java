
package Modelo;


import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> menus;

    private double subtotal;
    private double iva;
    private double total;

    public Cuenta(String nombreCliente) {

        this.nombreCliente = nombreCliente;
        menus = new ArrayList<>();
    }

    public void agregarMenu(Menu m) {
        menus.add(m);
    }

    public void calcularSubtotal() {

        subtotal = 0;

        for (Menu m : menus) {
            subtotal += m.getValorMenu();
        }
    }

    public void calcularIva() {
        iva = subtotal * 0.15;
    }

    public void calcularTotal() {
        total = subtotal + iva;
    }

    @Override
    public String toString() {

        String cadena = "\nCliente: " + nombreCliente;

        for (Menu m : menus) {
            cadena += "\n" + m;
        }

        cadena += "\n\nSubtotal: $" + subtotal;
        cadena += "\nIVA: $" + iva;
        cadena += "\nTOTAL: $" + total;

        return cadena;
    }
}