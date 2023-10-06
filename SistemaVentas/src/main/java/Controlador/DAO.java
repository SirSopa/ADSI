/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controlador;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Alumno4
 */
public interface DAO <T>{
      
    Optional<T> get(long id);
    
    List<T> getAll();
    
    void guarda(T t);
    
    void actualiza(T t, String[] params);
    
    void elimina(T t);
    
}
