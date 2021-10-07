package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Message;
import com.game.g8.sa.reto3grupo8.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class MessageService {
    @Autowired // Instanciar
    private MessageRepository repository;
    
    /**C
     * Guardar producto
     */
    public Message saveMessage(Message message){
        return repository.save(message);
    }
    
    /**R
     * mostrar todos los productos
     */
    public List<Message> getProductoAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar message por ID
     */
    public Message updateMessage(Message message){
        Message existeMessage = repository.findById(message.getId()).orElse(null);
        existeMessage.setMessagetext(message.getMessagetext());
        return repository.save(existeMessage);
    }
    
    /**c
     * Eliminar mensaje por ID
     */
    public String deleteMessage(int id){
        repository.deleteById(id);
        return "Producto removido" +id;
    }
    
}
