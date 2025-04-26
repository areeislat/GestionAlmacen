public class Main {
    public static void main(String[] args) throws Exception {
        //Registro de inventario
        Inventario inventario1 = new Inventario();

        Boleta boleta1 = new Boleta();


        

        //Se agregan usuarios al sistema


        //manzana
        ObjetoFruta fruta1 = new ObjetoFruta("Manzana", "Verde", 590, 5);
        //Zanahoria
        ObjetoVerdura verdura1 = new ObjetoVerdura("Zanahoria", 1.2, 990, 3);
        //leche
        ObjetoLacteo leche1 = new ObjetoLacteo("Leche", "Almendras", 2590, 7);

        //Se agregan al inventario
        inventario1.agregarObjeto(fruta1);
        inventario1.agregarObjeto(verdura1);
        inventario1.agregarObjeto(leche1);

        boleta1.elegirOpcion();
        //Validacion Usuario
        //sistema1.validarUsuario();
        //Compra
        
    }
}
