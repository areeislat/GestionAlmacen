import java.util.ArrayList;
import java.util.Scanner;

public class Boleta implements IvaBoleta {
    private ArrayList<ObjetoInventario> compra;

    public Boleta(){
        compra = new ArrayList<>();
    }

    public ArrayList<ObjetoInventario> getCompra() {
        return compra;
    }

    public void realizarCompra(ObjetoFruta fruta, ObjetoVerdura verdura, ObjetoLacteo lacteo){

        System.out.println("¿Qué desea comprar? ");
        System.out.println(fruta.getObjeto() + " - Precio: $" + fruta.getPrecio());
        System.out.println(verdura.getObjeto() + " - Precio: $" + verdura.getPrecio());
        System.out.println(lacteo.getObjeto() + " - Precio: $" + lacteo.getPrecio());
        System.out.println("Escriba (manzana, zanahoria o leche)");
    }


    // No lo repito
    public void mostrarMenu() {
        System.out.println("===Sistema Almacen===");
        System.out.println("1. Entrar por usuario");
        System.out.println("2. Realizar compra");
        System.out.println("3. Salir");
        System.out.println("=====================");
       }

    // Scanner en el while / switch?
    // Aquí implemento el calculo del iva
    public void elegirOpcion() {

        Scanner scanner = new Scanner (System.in);
        String decision = "";

        UsuarioSistema sistema1 = new UsuarioSistema();
        Usuario usuario1 = new Usuario(1, "Areliz", "198291579-9");
        Usuario usuario2 = new Usuario(2, "Alma", "25960968-2");

        ObjetoFruta fruta1 = new ObjetoFruta("Manzana", "Verde", 590, 5);
        ObjetoVerdura verdura1 = new ObjetoVerdura("Zanahoria", 1.2, 990, 3);
        ObjetoLacteo leche1 = new ObjetoLacteo("Leche", "Almendras", 2590, 7);


        sistema1.agregarUsuario(usuario1);
        sistema1.agregarUsuario(usuario2);

        Boleta compra1 = new Boleta();
        double totalSinIVA = 0.0;

        mostrarMenu();
        
        while (!decision.equals("3")) {
            
            decision = scanner.nextLine();

            switch (decision) {
                case "1":
                    sistema1.validarUsuario();
                    mostrarMenu();
                    break;
                case "2":
                    //Compra
                    realizarCompra(fruta1,verdura1,leche1);
                    break;
                case "manzana":
                    compra.add(fruta1);
                    System.out.println("Se agregó manzana a su carrito");
                    mostrarMenu();
                    break;
                case "zanahoria":
                    compra.add(verdura1);
                    System.out.println("Se agregó zanahoria a su carrito");
                    mostrarMenu();
                    break;
                case "leche":
                    compra.add(leche1);
                    System.out.println("Se agregó leche a su carrito");
                    mostrarMenu();
                    break;
                case "3":
                    System.out.println("Imprimiento boleta...");
                    System.out.println("=====================");
                    for (ObjetoInventario item : getCompra()) {
                        System.out.println(item);
                        totalSinIVA += item.getPrecio();
                    }
                    System.out.println("=====================");
                    
                    System.out.println("Su total sin iva compra es: " + totalSinIVA);
                    calcularIVA();
                    double iva = totalSinIVA * 0.19;
                    double totalCompra = totalSinIVA + iva;
                    System.out.println("Su total de la compra es: " + totalCompra);
                    break;
                default:
                    System.out.println("Elija una opcion válida");
                    System.out.println("1,2,3 o manzana, zanahoria, verdura");
                    mostrarMenu();
        
            }
        }
    }

    //Esto va despues poh
    @Override
    public void calcularIVA() {
        System.out.println("Calculando iva...");
    }



}

