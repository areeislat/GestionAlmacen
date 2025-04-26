public abstract class ObjetoStock implements disminuirStock{
    private int stock;

public ObjetoStock(int stock){
    this.stock = stock;
}

public int getStock(){
    return stock;
}

@Override
public void stockActualizado(int stockComprado) {
    stock -= stockComprado;
    System.out.println("Se agregaron al inventario " + stockComprado + ". Quedan " + stock);
}

}
