import java.util.ArrayList;

public class Inventario {
    private ArrayList<ObjetoInventario> objetos;

    public Inventario(){
        objetos = new ArrayList<>();
    }

    //

    public void agregarObjeto(ObjetoInventario objeto){
        objetos.add(objeto);
        System.out.println("Producto " + objeto.getObjeto() + " ha sido agregado a inventario.");
    }

    // Mostrar inventario
    public void mostrarInventario(){
        System.out.println("------Mostrando inventario-----");
        for(int i = 0; i < objetos.size(); i++){
            System.out.println(i + ": " + objetos.get(i).getObjeto());
        }
    }

    public ArrayList<ObjetoInventario> getObjeto(){
        return objetos;
    }

}
