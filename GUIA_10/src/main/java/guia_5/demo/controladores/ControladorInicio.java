/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_5.demo.controladores;

import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import guia_5.demo.modelo.Usuario;
import guia_5.demo.servicio.IUsuarioServicio;
import java.util.List;
/**
 *
 * @author ldric
 */



@Controller
@Slf4j

public class ControladorInicio {
    //@Value("${index.mensaje}")
    //0String dato;
    @Autowired
    IUsuarioServicio userServicio;
    @GetMapping("/")
    public String inicio(Model modelo){
       List<Usuario> listaUsuarios = (List<Usuario>) userServicio.ListarUsuarios();
        modelo.addAttribute("usuarios",listaUsuarios);
       /* String mensaje = "saludos desde Spring MVC con paso de información";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u = new Usuario();
        u.setCedula("1234");
        u.setClave("abcd");
        u.setNombre("Luis Ricardo");
        u.setEmail("luissayas@gmail");
        modelo.addAttribute("usuario 1", u);
        Usuario u2 = new Usuario();
        u2.setCedula("1235");
        u2.setClave("345");
        u2.setNombre("marcelo rios");
        u2.setEmail("marce@gmail");
       
        
        Usuario u3 = new Usuario();
        u3.setCedula("9766");
        u3.setClave("577");
        u3.setNombre("carlos medoza");
        u3.setEmail("thiago@gmail");
        
        
        List<Usuario> ListaUsuarios = Arrays.asList(u2,u3);
        modelo.addAttribute("usuarios", ListaUsuarios);*/
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar (Usuario usuario){
        return "modificar";
    }
    @PostMapping("/guardar")
    public String guardar(Usuario usuario){
        userServicio.guardar(usuario);
        return "redirect/";
    }
}

