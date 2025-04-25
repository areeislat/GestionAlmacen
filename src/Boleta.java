import java.util.ArrayList;
import java.util.Scanner;

public class Boleta implements IvaBoleta {
    private ArrayList<ObjetoInventario> compra;

    public Boleta(){
        compra = new ArrayList<>();
    }

    //Esto esta bien o deberia llamar al objeto inventario?
    //pero no es abstracto
    public void agregarCompraFruta(ObjetoFruta fruta){
        compra.add(fruta);
    }

    public void agregarCompraVerdura(ObjetoVerdura verdura){
        compra.add(verdura);
    }

    public void agregarCompraLacteo(ObjetoLacteo lacteo){
        compra.add(lacteo);
    }

    //Esto va despues poh
    @Override
    public void calcularIVA() {
        System.out.println("Calculando iva...");
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
        
        while (!decision.equals("3")) {
            mostrarMenu();
            String desicion = scanner.nextLine();
            switch (decision) {
                case "1":
                //como lo agrego sin que me de error?
                    //validarUsuario();
                    break;
                case "2":
                    //Compra
                    break;
                case "3":
                    // Calcular iva
                    calcularIVA();
                    System.out.println("Su total de la compra es: ");
                    break;
                default:
                    
        }
    }

}
