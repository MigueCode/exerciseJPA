package com.exercise.exercise.controller;

import com.exercise.exercise.model.Empleados;
import com.exercise.exercise.service.EmpleadosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bastidas
 */

@RestController
@RequestMapping("/api/empleados")
public class EmpleadosController {
    
    @Autowired
    EmpleadosService empleadosService;
    
    @GetMapping("/all")
    public List<Empleados> getEmpleados(){
        return empleadosService.getAll();
    }
}
