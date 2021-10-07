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
 */
@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Entity 
@Table(name="games")
public class Games {
    @Id 
    @GeneratedValue 
    private int id;
    private String developer;
    private int minage;
    private int category_id;
    private String name;
    
}
