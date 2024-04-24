/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia_5.demo.modelo;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 *
 * @author ldric
 */
@Entity
@Table(name = "Usuarios")
@Data
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    private String cedula;
    
    private String nombre;
    private String email;
    private String clave;
}
