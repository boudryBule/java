package com.gm.HolaMundo.servicio;

import com.gm.HolaMundo.dao.UsuarioDao;
import com.gm.HolaMundo.domain.Rol;
import com.gm.HolaMundo.domain.Usuario;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")//asi indicamos que la clase UsuarioService va a ser un bean de spring de tipo de servicio y que se va a llamar userDetailsService
@Slf4j //para le manejo de loging
public class UsuarioService  implements UserDetailsService{ //UserDetailsService para la seguridad

    
    @Autowired //para inyectar una instancia de tipo usuarioDao, ya que lo vamos a necesitar
    private UsuarioDao usuarioDao; //con esta clase vamos a interactuar con la tabla de roles y de usuarios
    
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //va a obtener el objeto usuario filtrado por un username
        Usuario usuario = usuarioDao.findByUsername(username); //con esto ya estamos recuperando el usuario
        
        
        if(usuario == null){
            throw new UsernameNotFoundException(username);
        }
        
        var roles = new ArrayList<GrantedAuthority>(); //recuperamos los roles
        
        for(Rol rol: usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }
    
}
