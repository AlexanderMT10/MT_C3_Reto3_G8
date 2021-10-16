package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Score;
import com.game.g8.sa.reto3grupo8.repository.ScoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repositoryS;

    //Crud - Create - post
    public Score saveScore(Score score) {
        return repositoryS.save(score);
    }

    //cRud - Read - get
    public List<Score> getScoreAll() {
        return repositoryS.findAll();
    }

    //crUd - Update - put
    public Score updateScore(Score score) {
        Score existScore = repositoryS.findById(score.getId()).orElse(null);
        existScore.setCalification(score.getCalification());
        existScore.setMessage(score.getMessage());
        return repositoryS.save(existScore);
    }

    //cruD - Delete - delete
    public String deleteScore(Score score) {
        repositoryS.deleteById(score.getId());
        return "Registro de ID: " + score.getId() + " ha sido eliminado";
    }
}
