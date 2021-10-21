package com.exercise.exercise.service;

import com.exercise.exercise.model.Empleados;
import com.exercise.exercise.repository.EmpleadosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bastidas
 */

@Service
public class EmpleadosService {
    
    @Autowired
    EmpleadosRepository empleadosRepository;
    
    public List<Empleados> getAll(){
        return empleadosRepository.getAll();
    } 
}
