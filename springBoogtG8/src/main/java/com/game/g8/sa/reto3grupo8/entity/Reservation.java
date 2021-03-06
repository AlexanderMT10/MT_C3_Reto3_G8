package com.game.g8.sa.reto3grupo8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Reservation implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idReservation;
    private Calendar startDate;
    private Calendar devolutionDate;
    private String status="created";
    
    @ManyToOne
    @JoinColumn(name = "game_id")
    @JsonIgnoreProperties("reservations")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties({"reservations", "messages"})
    private Client client;

    @OneToOne(cascade = {CascadeType.PERSIST}, mappedBy = "reservation")
    @JoinColumn(name="score_id")
    @JsonIgnoreProperties("reservation")
    private Score score;
}
