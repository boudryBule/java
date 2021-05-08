package test;


import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc  = new UsuarioJDBC();
        
        //Insertando un nuevo objeto de tipo Usuario
        
//        Usuario usuarioNueva = new Usuario("Carlos", "123");
//        usuarioDao.insertar(usuarioNueva);

        //modificar un objeto de usuario existente
//        Usuario usuarioNueva = new Usuario(2,"Juan Carlos", "321");
//        usuarioJdbc.actualizar(usuarioNueva);
//        
        //eliminar un registro
        
        Usuario usuarioEliminar = new Usuario(1);
        usuarioJdbc.eliminar(usuarioEliminar);
        
        List<Usuario> usuarios = usuarioJdbc.seleccionar(); //como seleccionar nos devuelve una lista de usuarios tenemos que poner una variable que sea una lista de usuarios
        
        for(Usuario usuario: usuarios){
            System.out.println("usuario = " + usuario);
        }
    }
}
