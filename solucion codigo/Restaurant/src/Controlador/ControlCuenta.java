
package Controlador;
import Modelo.Cuenta;

public class ControlCuenta {

    public void procesarCuenta(Cuenta c) {

        c.calcularSubtotal();
        c.calcularIva();
        c.calcularTotal();
    }
}