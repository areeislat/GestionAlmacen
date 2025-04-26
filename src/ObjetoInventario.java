public class ObjetoInventario extends ObjetoStock{
    private String objeto;
    private float precio;
    

    public ObjetoInventario(String objeto, float precio, int stock){
        super(stock);
        this.objeto = objeto;
        this.precio = precio;
    }

    public String getObjeto(){
        return objeto;
    }

    public void setObjeto(String objeto){
        this.objeto = objeto;
    }

    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio){
        if(precio < 0){
            this.precio = precio;
        }
        else{System.out.println("El precio debe ser mayor a cero.");}
    }

    @Override
    public String toString() {
        return "Fruta: " + objeto + ", Precio: $" + precio;
    }
}
