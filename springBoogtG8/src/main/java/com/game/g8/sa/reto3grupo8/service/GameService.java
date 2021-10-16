package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Game;
import com.game.g8.sa.reto3grupo8.repository.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class GameService {
    @Autowired //Instanciar
    private GameRepository repository;
    
    /**C
     * Guardar Juego
     */
    public Game saveGame(Game game){
        return repository.save(game);
    }
    
    /**R
     * mostrar todos los juegos
     */
    public List<Game> getGameAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar games por ID
     */
    public Game updateGame(Game game){
        Game existeGame = repository.findById(game.getId()).orElse(null);
        existeGame.setDeveloper(game.getDeveloper());
        existeGame.setYear(game.getYear());
        existeGame.setName(game.getName());
        existeGame.setDescription(game.getDescription());
        return repository.save(existeGame);
    }
    
    /**c
     * Eliminar games por ID
     */
    public String deleteGame(int id){
        repository.deleteById(id);
        return "Producto removido" +id;
    }
}
