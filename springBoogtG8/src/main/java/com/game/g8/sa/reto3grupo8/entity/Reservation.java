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
@Table(name="reservation")
public class Reservation {
    @Id 
    @GeneratedValue 
    private int idReservation;
    private String startDate;
    private String devolutionDate;
}
