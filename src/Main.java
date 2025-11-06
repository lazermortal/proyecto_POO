import carrito.Carrito;
import compra.Compra;
import producto.DesarrolladorProducto;
import producto.Producto;
import usuario.Cliente;
import usuario.consejoSombrio.AdministradorContenido;
import usuario.consejoSombrio.AdministradorUsuario;
import usuario.duena.Duena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Listas
        List<Producto> inventario = new ArrayList<>();
        List<Carrito> carritos = new ArrayList<>();
        List<AdministradorUsuario> administradoresUsuario = new ArrayList<>();
        List<AdministradorContenido> administradoresContenidos = new ArrayList<>();
        List<DesarrolladorProducto> desarrolladoresProductos = new ArrayList<>();

        Duena cabrita = new Duena(1L, "Sakura", "Dueña" , "LaCabraLoca@eia.edu.co", "27/02/2025" , "Activo" , "LaCabritaMamalona" , "28/09/2025");

        //Login
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Login----------- \n Ingrese el nombre de usuario");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la contraseña");
        String password = sc.nextLine();

        if(password.equals("AguapanelaConQueso123")){
            for(DesarrolladorProducto p : desarrolladoresProductos){
                if(p.getNombre().equals(nombre)){
                    menuDesarrollador();
                }
            }
        }if(password.equals("PandequesoRicolino")){
            for(AdministradorUsuario p : administradoresUsuario){
                if(p.getNombre().equals(nombre)){
                    menuAdministradorUsuario();
                }
            }
        }if(password.equals("SalpiconApanado")){
            for(AdministradorContenido p : administradoresContenidos){
                if(p.getNombre().equals(nombre)){
                    menuAdministradorContenido();
                }
            }
        }if(password.equals(cabrita.getClaveMaestra())){
            menuDuena();
        }else{
            menuCliente();
        }

        Cliente pablo = new Cliente(1234L,"juan","causa","eamil.com","19/08/2000","jijijjaja","calle 9",1233432323);
        System.out.println("Pablo: " + pablo.getNombre());
        Carrito carrito = new Carrito(1L,pablo);


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
        Producto novoProducto=dev.crearProducto(12l,"zapatos","si",123,8,"ayer");
        Cliente c1 = new Cliente(12L,"juan","cliente","eia","agosto","activa");

        Carrito carrito1=c1.crearCarrito(12L);
        c1.añadirNuevoProductoCarrito(nuevoProducto,5,"calle 7",carrito1);
        c1.añadirNuevoProductoCarrito(novoProducto,2,"calle 7",carrito1);
        System.out.println(carrito1.getFechaCreacion());





        /*
        Compra compra=c1.crearCompra("calle 2","123",carrito1,c1);
        for(int i = 0;i<compra.getLineaCompras().size();i++){
            System.out.println(compra.getLineaCompras().get(i).getProducto().getNombre());
        }*/
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