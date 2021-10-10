package com.game.g8.sa.reto3grupo8.controller;

import com.game.g8.sa.reto3grupo8.entity.Client;
import com.game.g8.sa.reto3grupo8.service.ClientServicio;
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
@RequestMapping("/api/Client/")
public class ClientController {
    
    @Autowired
    private ClientServicio service;
    
    @GetMapping("/all")
    public List<Client> findAllClient(){
        return service.getClientAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addClient(@RequestBody Client client){
        service.saveClient(client);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateClient(@RequestBody Client client){
        service.updateClient(client);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/dalete")
    public ResponseEntity deleteClient(@RequestBody Client client){
        service.deleteClient(client.getIdClient());
        return ResponseEntity.status(201).build();
    }
}
