package com.game.g8.sa.reto3grupo8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Grupo08
 */
@Data //Que va ser un dato
@AllArgsConstructor //Que se puede soportar todos los argumentos el constructor
@NoArgsConstructor //Si no quiere no tiene constructor
@Entity // Spring boot lo reconoce como una entidad
@Table(name="score")
public class Score implements Serializable{
    @Id //clave primaria de la tabla Client
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Que la id va ser autoIncremental
    private int id;
    private String calification;
    private String message;

    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;
;
    
}
