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
     * Guardar cleinte
     */
    public Client saveClient(Client client){
        return repository.save(client);
    }
    
    /**R
     * mostrar todos los cleintes
     */
    public List<Client> getClientAll(){
        return repository.findAll();
    }
    
    public Client getClientById(int id){
        return repository.findById(id).orElse(null);
    }
    
    /**U
     * Actualizar client por ID
     */
    public Client updateClient(Client client){
        Client existeClient = repository.findById(client.getIdClient()).orElse(null);
        existeClient.setEmail(client.getEmail());
        existeClient.setPassword(client.getPassword());
        existeClient.setName(client.getName());
        existeClient.setAge(client.getAge());
        return repository.save(existeClient);
    }
    
    /**c
     * Eliminar cliente por ID
     */
//    public String deleteClient(int idClient){
//        repository.deleteById(idClient);
//        return "Producto removido" +idClient;
//    }
    public void deleteClient(int id){
        repository.deleteById(id);
    }

}
