/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guia_5.demo.servicio;


import java.util.List;
import guia_5.demo.modelo.Usuario;

/**
 *
 * @author ldric
 */
public interface IUsuarioServicio {
    public List<Usuario> ListarUsuarios();
    
    public void guardar (Usuario user);
    public void eliminar (Usuario user);
    public Usuario buscar (Usuario user);
    
}
