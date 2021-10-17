package com.game.g8.sa.reto3grupo8.service;

import com.game.g8.sa.reto3grupo8.entity.Category;
import com.game.g8.sa.reto3grupo8.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo08
 */
@Service
public class CategoryService {
    @Autowired //Instanciar
    private CategoryRepository repository;
    
    /**C
     * Guardar Category
     */
    public Category saveCategory(Category category){
        return repository.save(category);
    }
    
    /**R
     * mostrar todos las category
     */
    public List<Category> getCategoryAll(){
        return repository.findAll();
    }
    
    public Category getCategoryById(int id){
        return repository.findById(id).orElse(null);
    }
    
    /**U
     * Actualizar category por ID
     */
    public Category updateCategory(Category category){
        Category existeCategory = repository.findById(category.getId()).orElse(null);
        existeCategory.setName(category.getName());
        existeCategory.setDescription(category.getDescription());
        return repository.save(existeCategory);
    }
    
    /**c
     * Eliminar Category por ID
     */
//    public String deleteCategory(int id){
//        repository.deleteById(id);
//        return "Producto removido" +id;
//    }
    public void deleteCategory(int id){
        repository.deleteById(id);
    }
}
