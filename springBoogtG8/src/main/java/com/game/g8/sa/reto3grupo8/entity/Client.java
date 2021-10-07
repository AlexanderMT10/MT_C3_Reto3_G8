package com.game.g8.sa.reto3grupo8.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Grupo08
 *  Escrito 7 ocutbre 2021
 */

@Data //Que va ser un dato
@AllArgsConstructor //Que se puede soportar todos los argumentos el constructor
@NoArgsConstructor //Si no quiere no tiene constructor
@Entity // Spring boot lo reconoce como una entidad
@Table(name="client")
public class Client {
    @Id //clave primaria de la tabla Client
    @GeneratedValue //Que la id va ser autoIncremental
    private int id;
    private String name;
    private String email;
    private int age;
      
}
