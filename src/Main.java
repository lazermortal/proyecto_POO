import carrito.Carrito;
import producto.DesarrolladorProducto;
import producto.Producto;
import usuario.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente pablo = new Cliente(1234L,"juan","causa","eamil.com","19/08/2000","jijijjaja","calle 9",1233432323);
        System.out.println("Pablo: " + pablo.getNombre());
        Carrito carrito = new Carrito(1L,"3",pablo);


        DesarrolladorProducto dev = new DesarrolladorProducto(
                1L,
                "Laura García",
                "Product Developer",
                "laura.garcia@empresa.com",
                "2025-11-04",
                "Activa",
                "Diseño de interfaces y UX"
        );
      Producto nuevoProducto=dev.crearProducto(12l,"papaya","si",123,8,"ayer");
        dev.crearProducto(12l,"papaya","si",123,8,"ayer");
        Cliente c1 = new Cliente(12L,"juan","cliente","eia","agosto","activa");

        Carrito carrito1=c1.crearCarrito(12L,"ayer");
        c1.añadirNuevoProductoCarrito(nuevoProducto,5,"calle 7",carrito1);
        c1.añadirNuevoProductoCarrito(nuevoProducto,5,"calle 7",carrito1);





/*
        c1.buscarProducto("PaPa");
*//*
        for(int i=0;i<(c1.getCarritos().size());i++){
            for(int j=0;j<(c1.getCarritos().get(i).getLineaCarritos().size());j++){
                System.out.println(c1.getCarritos().get(i).getLineaCarritos().get(j).getProductos().getNombre());

            }
        }*/

/*
        for(int i=0;i<dev.getProductos().size();i++){
          System.out.println(dev.getProductos().get(i).getNombre());
      }*/
    }
}