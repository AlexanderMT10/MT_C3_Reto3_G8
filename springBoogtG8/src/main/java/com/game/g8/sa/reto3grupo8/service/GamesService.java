package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Games;
import com.game.g8.sa.reto3grupo8.repository.GamesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class GamesService {
    @Autowired //Instanciar
    private GamesRepository repository;
    
    /**C
     * Guardar producto
     */
    public Games saveGames(Games games){
        return repository.save(games);
    }
    
    /**R
     * mostrar todos los productos
     */
    public List<Games> getProductoAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar games por ID
     */
    public Games updateGames(Games games){
        Games existeGames = repository.findById(games.getId()).orElse(null);
        existeGames.setDeveloper(games.getDeveloper());
        existeGames.setMinage(games.getMinage());
        existeGames.setCategory_id(games.getCategory_id());
        existeGames.setName(games.getName());
        return repository.save(existeGames);
    }
    
    /**c
     * Eliminar producto por ID
     */
    public String deleteGames(int id){
        repository.deleteById(id);
        return "Producto removido" +id;
    }
}
