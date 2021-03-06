package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Reservation;
import com.game.g8.sa.reto3grupo8.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class ReservationService {
    @Autowired //Instanciar
    private ReservationRepository repository;
    
    /**C
     * Guardar reservacion
     */
    public Reservation saveReservation(Reservation reservation){
        return repository.save(reservation);
    }
    
    /**R
     * mostrar todos las reservaciones
     */
    public List<Reservation> getReservationAll(){
        return repository.findAll();
    }
    
    public Reservation getReservationById(int id){
        return repository.findById(id).orElse(null);
    }
    
    /**U
     * Actualizar client por ID
     */
    public Reservation updateReservation(Reservation reservation){
        Reservation existeReservation = repository.findById(reservation.getIdReservation()).orElse(null);
        existeReservation.setStartDate(reservation.getStartDate());
        existeReservation.setDevolutionDate(reservation.getDevolutionDate());
        return repository.save(existeReservation);
    }
    
    /**c
     * Eliminar producto por ID
     */
//    public String deleteReservation(int idReservation){
//        repository.deleteById(idReservation);
//        return "Producto removido" +idReservation;
//    }
    public void deleteReservation(int id){
        repository.deleteById(id);
    }
}
