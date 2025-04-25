public class Main {
    public static void main(String[] args) throws Exception {
        //Registro de inventario
        Inventario inventario1 = new Inventario();
        UsuarioSistema sistema1 = new UsuarioSistema();

        Usuario usuario1 = new Usuario(1, "Areliz", "198291579-9");
        Usuario usuario2 = new Usuario(2, "Alma", "25960968-2");

        //Se agregan usuarios al sistema
        sistema1.agregarUsuario(usuario1);
        sistema1.agregarUsuario(usuario2);

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


        //Validacion Usuario
        sistema1.validarUsuario();
        //Compra
        
    }
}
