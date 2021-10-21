package com.exercise.exercise.repository;

import com.exercise.exercise.model.Empleados;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * En esta clase definimos los metodos que utilizaran los metodos de CrudRepository
 * @author Bastidas
 */

@Repository
public class EmpleadosRepository {
    
    @Autowired
    EmpleadosCrudRepository empleadosCrudRepository;
    
    public List<Empleados> getAll(){
        return (List<Empleados>) empleadosCrudRepository.findAll();
    } 
}
