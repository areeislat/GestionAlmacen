import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioSistema {
    private ArrayList<Usuario> usuarios;

    public UsuarioSistema(){
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(int id, String nombre, String rut){
        Usuario usuario = new Usuario(id, nombre, rut);
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.getNombre() + " ha sido agregado al sistema.");
    }

    public boolean validarUsuario(Scanner scanner){
        System.out.println("Ingrese usuario:");
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
    
