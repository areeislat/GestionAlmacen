import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioSistema {
    private ArrayList<Usuario> usuarios;

    public UsuarioSistema(){
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " ha sido agregado al sistema.");
    }

    //Mejorar!!!
    public void validarUsuario(){
        //¿if?
        System.out.println("Ingrese usuario:");
        Scanner scanner = new Scanner (System.in);
        String nombreUsuario = scanner.nextLine();
        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNombre().equals(nombreUsuario)){
                System.out.println("Usuario validado.");
                break;
            }
            else{
                System.out.println("Ingrese usuario valido.");
            }
    }
}
    
}
