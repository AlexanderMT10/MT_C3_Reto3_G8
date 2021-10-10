package com.game.g8.sa.reto3grupo8.controller;

import com.game.g8.sa.reto3grupo8.entity.Games;
import com.game.g8.sa.reto3grupo8.service.GamesService;
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
@RequestMapping("/api/Game/")
public class GamesController {
    @Autowired
    private GamesService service;
    
    @GetMapping("/all")
    public List<Games> findAllGames(){
        return service.getGamesAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addGames(@RequestBody Games games){
        service.saveGames(games);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/update")
    public ResponseEntity updateGames(@RequestBody Games games){
        service.updateGames(games);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/dalete")
    public ResponseEntity deleteGames(@RequestBody Games games){
        service.deleteGames(games.getId());
        return ResponseEntity.status(201).build();
    }
}
