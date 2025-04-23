
public class Usuario {

    private int id;
    private String nombre;
    private String rut;

    public Usuario(int id, String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getRut(){
        return rut;
    }



}

