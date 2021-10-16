package com.game.g8.sa.reto3grupo8.controller;

import com.game.g8.sa.reto3grupo8.entity.Score;
import com.game.g8.sa.reto3grupo8.service.ScoreService;
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
@RequestMapping("/api/Calification/")
public class ScoreController {
    @Autowired
    private ScoreService service;

    @GetMapping("all")
    public List<Score> findAllScore() {
        return service.getScoreAll();
    }

    @PostMapping("save")
    public ResponseEntity addScore(@RequestBody Score score) {
        service.saveScore(score);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("update")
    public ResponseEntity updateScore(@RequestBody Score score) {
        service.updateScore(score);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("delete")
    public ResponseEntity deleteScore(@RequestBody Score score) {
        service.deleteScore(score);
        return ResponseEntity.status(204).build();
    }   

}
