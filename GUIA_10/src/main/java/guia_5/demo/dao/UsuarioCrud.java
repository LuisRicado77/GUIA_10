/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guia_5.demo.dao;

import guia_5.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ldric
 */@EnableJpaRepositories
public interface UsuarioCrud extends CrudRepository<Usuario, String>{
    
}
