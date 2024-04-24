
package guia_5.demo.servicio;

import java.util.List;
import guia_5.demo.dao.UsuarioCrud;
import guia_5.demo.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author ldric
 */
@Service
public class UsuarioServicioImp implements IUsuarioServicio {
      @Autowired
    UsuarioCrud crudUser;
    
    @Transactional (readOnly = true)
      @Override
    public List<Usuario> ListarUsuarios(){
        return (List <Usuario>) crudUser.findAll();
    }
    
    @Transactional
    @Override
    public void eliminar(Usuario user){
        crudUser.delete(user);
    }
    
    @Transactional
    @Override
    public void guardar(Usuario user){
        crudUser.save(user);
    }
    
    @Transactional(readOnly = true)
    @Override
    public Usuario buscar(Usuario user){
        return crudUser.findById(user.getCedula()).orElse(null);
    } 
}
