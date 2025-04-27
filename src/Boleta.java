import java.util.ArrayList;

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
    }


    // Obtengo mi informacion de mi carrito de compra
    //Obtener el precio y cantidad
        //recorrer cada objeto de mi carrito de compra
        //obtener el precio y cantidad de cada uno de esos objeto y hacer el calculo
        //guardar esa variable y sumar el siguiente calculo del recorrido del objeto 
        //Calculo del subtotal
    //Calculo del iva
    //Calculo total
    //Mostrar la boleta con los datos

    public void calculoBoleta(Inventario carritoCompra){
        carritoCompra. mostrarInventario();
        //iterando por cada objeto del carrito de compra
        float calculo = 0;
        for (ObjetoInventario objeto : carritoCompra.getObjeto()) {
            calculo += (objeto.getPrecio() * (float) objeto.getStock());
        }

        System.out.println("Subtotal compra: ");
        System.out.println("$" + calculo);

        calcularIVA(calculo);
    }

    @Override
    public void calcularIVA(float calculo) {
        System.out.println("Calculando iva y total...");
        double valorIVA = calculo * IvaBoleta.iva;
        System.out.println("Su IVA es: $" + valorIVA);
        double totalCompra = calculo + valorIVA;
        System.out.println("Su total: $" + totalCompra);
    }



}

