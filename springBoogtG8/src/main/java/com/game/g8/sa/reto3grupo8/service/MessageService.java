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
    public List<Message> getMessageAll(){
        return repository.findAll();
    }
    
    /**U
     * Actualizar message por ID
     */
    public Message updateMessage(Message message){
        Message existeMessage = repository.findById(message.getIdMessage()).orElse(null);
        existeMessage.setMessageText(message.getMessageText());
        return repository.save(existeMessage);
    }
    
    /**c
     * Eliminar mensaje por ID
     */
    public String deleteMessage(int idMessage){
        repository.deleteById(idMessage);
        return "Producto removido" +idMessage;
    }
    
}
