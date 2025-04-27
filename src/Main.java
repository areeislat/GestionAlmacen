import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Registro de inventario
        Inventario inventario1 = new Inventario();

        Boleta boleta1 = new Boleta();
        SistemaCompra sistemaCompra = new SistemaCompra(inventario1);

        //manzana
        ObjetoFruta fruta1 = new ObjetoFruta("Manzana", "Verde", 590, 5);
        //Zanahoria
        ObjetoVerdura verdura1 = new ObjetoVerdura("Zanahoria", 1.2, 990, 3);
        //leche
        ObjetoLacteo leche1 = new ObjetoLacteo("Leche", "Almendras", 2590, 7);


        Scanner scanner = new Scanner (System.in);
        String decision = "";

        UsuarioSistema sistema1 = new UsuarioSistema();
        Usuario usuario1 = new Usuario(1, "Areliz", "198291579-9");
        Usuario usuario2 = new Usuario(2, "Alma", "25960968-2");

        //Se agregan al inventario
        inventario1.agregarObjeto(fruta1);
        inventario1.agregarObjeto(verdura1);
        inventario1.agregarObjeto(leche1);

        //inventario1.mostrarInventario();


        while (!decision.equals("4")) {
            mostrarMenu();
            decision = scanner.nextLine();
            switch (decision) {
                //Crear usuario
                case "1":
                    System.out.println("Ingrese el id del usuario: ");
                    int id = scanner.nextInt();
                    System.out.println("Ingrese el nombre del usuario: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el rut del cliente");
                    String rut = scanner.nextLine();
                    sistema1.agregarUsuario(id, decision, decision);
                    break;
                case "2":
                    //Validar el usuario
                    sistema1.validarUsuario(scanner);
                case "3":
                    int seguirCompra = 0;
                    Inventario carritoCompra = new Inventario();
                    while(seguirCompra != 2){
                        inventario1.mostrarInventario();
                        System.out.println("Escoge el producto a comprar: ");
                        int indice = scanner.nextInt();
                        System.out.println("Escoge la cantidad a comprar: ");
                        int cantidad = scanner.nextInt();
                        sistemaCompra.AgregarAlCarrito(cantidad, indice, carritoCompra);
                        System.out.println("¿Quiere seguir la compra. 1. Si 2.No");
                        seguirCompra = scanner.nextInt();
                        }
                        System.out.println("==================");
                        boleta1.calculoBoleta(carritoCompra);
                        break;    
                default:
                    break;
        
            }
        }
    }

    
    public static void mostrarMenu() {
        System.out.println("===Sistema Almacen===");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Validar Usuario");
        System.out.println("3. Realizar compra");
        System.out.println("4. Salir");
        System.out.println("=====================");
       }

}
