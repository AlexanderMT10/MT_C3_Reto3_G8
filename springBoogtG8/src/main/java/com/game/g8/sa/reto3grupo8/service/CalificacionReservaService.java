package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.CalificacionReserva;
import com.game.g8.sa.reto3grupo8.repository.CalificacionReservaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class CalificacionReservaService {
    @Autowired //Instanciar
    private CalificacionReservaRepository repository;
    
    /**C
     * Guardar calificacion rev
     */
    public CalificacionReserva saveCalificacionReserva(CalificacionReserva calificacionReserva){
        return repository.save(calificacionReserva);
    }
    
    /**R
     * mostrar todos las calificaciones
     */
    public List<CalificacionReserva> getCalificacionReservaAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar calificacion reserva por ID
     */
    public CalificacionReserva updateCalificacionReserva(CalificacionReserva calificacionReserva){
        CalificacionReserva existeCalificacionReserva = repository.findById(calificacionReserva.getIdCalificacionReserva()).orElse(null);
        existeCalificacionReserva.setCalificacion(calificacionReserva.getCalificacion());
        existeCalificacionReserva.setMensaje(calificacionReserva.getMensaje());
        return repository.save(existeCalificacionReserva);
    }
    
    /**c
     * Eliminar calificacion reserva por ID
     */
    public String deleteCalificacionReserva(int idCalificacionReserva){
        repository.deleteById(idCalificacionReserva);
        return "Producto removido" +idCalificacionReserva;
    }
}
