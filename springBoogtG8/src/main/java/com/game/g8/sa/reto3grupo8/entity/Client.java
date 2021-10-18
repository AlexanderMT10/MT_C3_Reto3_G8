package com.game.g8.sa.reto3grupo8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Client implements Serializable{
    @Id //clave primaria de la tabla Client
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Que la id va ser autoIncremental
    private int idClient;
    private String email;
    private String password;
    private String name;
    private int age;
    
    @OneToMany(cascade =CascadeType.PERSIST, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Message> messages;
    
    @OneToMany(cascade =CascadeType.PERSIST, mappedBy="client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservations;
      
}
