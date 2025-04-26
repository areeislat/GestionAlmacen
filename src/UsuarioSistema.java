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
    public boolean validarUsuario(){
        System.out.println("Ingrese usuario:");
        Scanner scanner = new Scanner (System.in);
        String nombreUsuario = scanner.nextLine();
        for (Usuario usuario : usuarios){
            if (usuario.getNombre().equals(nombreUsuario)){
                System.out.println("Usuario validado.");
                return true;
            }
        }
        System.out.println("Usuario no encontrado");
        return false;

    }
}
    
