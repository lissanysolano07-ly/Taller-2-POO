
package Vista;
import Controlador.ControlCuenta;
import java.util.Scanner;
import Modelo.Cuenta;
import Modelo.MenuCarta;
import Modelo.Menudia;
import Modelo.MenuEconomico;
import Modelo.MenuNinos;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String cliente = sc.nextLine();
        Cuenta cuenta = new Cuenta(cliente);
        cuenta.agregarMenu( new MenuCarta("Lomo Fino",10,2,1,10));
        cuenta.agregarMenu(new Menudia("Pollo Asado",8,1,1));
        cuenta.agregarMenu(new MenuNinos("Hamburguesa",6,1,1));
        cuenta.agregarMenu(new MenuEconomico("Arroz con Menestra",7,20));
        ControlCuenta control = new ControlCuenta();
        control.procesarCuenta(cuenta);
        System.out.println(cuenta);
    }
}