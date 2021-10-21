package com.exercise.exercise.repository;

import com.exercise.exercise.model.Empleados;
import org.springframework.data.repository.CrudRepository;

/**
 * Esta interfaz implementa todos los metodos de CrudRepository
 * @author Bastidas
 */
public interface EmpleadosCrudRepository extends CrudRepository<Empleados, Integer> {
    
}
