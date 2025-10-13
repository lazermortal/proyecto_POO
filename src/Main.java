import compra.Carrito;
import usuario.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente pablo = new Cliente(1234L,"juan","causa","eamil.com","19/08/2000","jijijjaja","calle 9",1233432323);
        System.out.println("Pablo: " + pablo.getNombre());
        Carrito carrito = new Carrito("1","3",pablo);
    }
}