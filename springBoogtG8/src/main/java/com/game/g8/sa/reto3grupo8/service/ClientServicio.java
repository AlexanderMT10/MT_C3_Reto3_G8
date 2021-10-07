package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Client;
import com.game.g8.sa.reto3grupo8.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class ClientServicio {
    @Autowired //Instanciar
    private ClientRepository repository;
    
    /**C
     * Guardar producto
     */
    public Client saveClient(Client client){
        return repository.save(client);
    }
    
    /**R
     * mostrar todos los productos
     */
    public List<Client> getProductoAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar client por ID
     */
    public Client updateClient(Client client){
        Client existeClient = repository.findById(client.getId()).orElse(null);
        existeClient.setName(client.getName());
        existeClient.setEmail(client.getEmail());
        existeClient.setAge(client.getAge());
        return repository.save(existeClient);
    }
    
    /**c
     * Eliminar producto por ID
     */
    public String deleteClient(int id){
        repository.deleteById(id);
        return "Producto removido" +id;
    }
}
