package com.game.g8.sa.reto3grupo8.controller;

import com.game.g8.sa.reto3grupo8.entity.Category;
import com.game.g8.sa.reto3grupo8.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Grupo08
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Category/")
public class CategoryController {
    @Autowired
    private CategoryService service;
    
    @GetMapping("/all")
    public List<Category> findAllCategory(){
        return service.getCategoryAll();
    }
    
    @GetMapping("{id}")    
    public Category findCategoryId(@PathVariable int id){
        return service.getCategoryById(id);
    }
    
    @PostMapping("/save")
    public ResponseEntity addCategory(@RequestBody Category category){
        service.saveCategory(category);
        return ResponseEntity.status(201).build();
    } 
    
    @PutMapping("/update")
    public ResponseEntity updateCategory(@RequestBody Category category){
        service.updateCategory(category);
        return ResponseEntity.status(201).build();
    }
    
//    @DeleteMapping("delete")
//    public ResponseEntity deleteCategory(@RequestBody Category category){
//        service.deleteCategory(category.getId());
//        return ResponseEntity.status(201).build();
//    }
    @DeleteMapping("/{id}")    
    public ResponseEntity deleteCategory(@PathVariable int id){
        service.deleteCategory(id);
        return ResponseEntity.status(204).build();
    }
}
