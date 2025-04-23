public class ObjetoFruta extends ObjetoInventario{
    private String colorFruta;

    public ObjetoFruta(String objeto, String colorFruta, float precio, int stock){
        super(objeto, precio, stock);
        this.colorFruta = colorFruta;
    }

    public String getTipo(){
        return colorFruta;
    }
}
