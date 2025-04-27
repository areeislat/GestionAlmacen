
import java.util.ArrayList;

public class SistemaCompra {
    Usuario usuario;
    Inventario tiendaStock;
    ArrayList<ObjetoInventario> carritoCompra;
    
    public SistemaCompra(Inventario inventario){
        this.tiendaStock = inventario;
        this.carritoCompra = new ArrayList<>();
    }

    public void AgregarAlCarrito(int cantidad, int indice, Inventario carritoCompra){
            //Tomo el objeto del inventario
            // toma le objeto especifico del indice
            ObjetoInventario objeto = tiendaStock.getObjeto().get(indice);
            if (objeto.getStock() >= cantidad){
                //Lo paso a mi carrito
                //Descuento del inventario
                //Añado a mi carrito
                objeto.stockActualizado(cantidad);
                ObjetoInventario objetoIngresado = new ObjetoInventario(objeto.getObjeto(), objeto.getPrecio(), cantidad);
                //Retornando le arraylist de nuestro carrito compra
                //recorrientdo todos los objetos de nuestro  carrito de compra
                for (ObjetoInventario obj : carritoCompra.getObjeto()){
                    //le preguntamos, si es que el objeto si es que el objeto tiene el mismo nombre que tenemos que preguntar
                    //no tenemos que crear otro, sino acutalizar el que ya existe
                    if(obj.getObjeto().equals(objetoIngresado.getObjeto())){
                        //se transforma en variable 
                        //si ya existe agregamos extra cantidad
                        int cantidadActualEnCarrito = obj.getStock();
                        cantidadActualEnCarrito += objetoIngresado.getStock();
                        //lo descuento de mi stock
                        objetoIngresado.stockActualizado(-cantidadActualEnCarrito);
                    }

                }
                carritoCompra.agregarObjeto(objetoIngresado);

            }
            
            


        
    }


}
