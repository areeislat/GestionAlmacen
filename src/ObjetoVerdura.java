public class ObjetoVerdura extends ObjetoInventario{
    private double pesoKilo;

    public ObjetoVerdura(String objeto, double pesoKilo, float precio, int stock){
        super(objeto, precio, stock);
        this.pesoKilo = pesoKilo;
    }

    public double getPesoKilo(){
        return pesoKilo;
    }
}
