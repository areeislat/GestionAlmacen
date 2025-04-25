public abstract class ObjetoInventario {
    private String objeto;
    private float precio;
    private int stock;

    public ObjetoInventario(String objeto, float precio, int stock){
        this.objeto = objeto;
        this.precio = precio;
        this.stock = stock;
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

    public int getStock(){
        return stock;
    }

    public void setPrecio(float precio){
        if(precio < 0){
            this.precio = precio;
        }
        else{System.out.println("El precio debe ser mayor a cero.");}
    }
}
