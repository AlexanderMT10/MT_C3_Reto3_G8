package com.game.g8.sa.reto3grupo8.controller;

import com.game.g8.sa.reto3grupo8.entity.CalificacionReserva;
import com.game.g8.sa.reto3grupo8.service.CalificacionReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Grupo08
 */
@RestController
@RequestMapping("/api/falta/")
public class CalificacionReservaController {
    
    @Autowired
    private CalificacionReservaService service;
    
    @GetMapping("/all")
    public List<CalificacionReserva> findAllCalificacionReserva(){
        return service.getCalificacionReservaAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addCalificacionReserva(@RequestBody CalificacionReserva calificacionReserva){
        service.saveCalificacionReserva(calificacionReserva);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateCalificacionReserva(@RequestBody CalificacionReserva calificacionReserva){
        service.updateCalificacionReserva(calificacionReserva);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/dalete")
    public ResponseEntity deleteCalificacionReserva(@RequestBody CalificacionReserva calificacionReserva){
        service.deleteCalificacionReserva(calificacionReserva.getIdCalificacionReserva());
        return ResponseEntity.status(201).build();
    }
}
