package com.ProyectoPersonal.ToDo_list.controller;

import com.ProyectoPersonal.ToDo_list.model.Tarea;
import com.ProyectoPersonal.ToDo_list.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")

public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> VerTareas(){
        return tareaService.VerTareas();
    }

    @PostMapping
    public Tarea CrearTarea(@RequestBody Tarea tarea){
        return tareaService.CrearTarea(tarea);
    }

    @PutMapping ("/{id}")
    public Tarea Actualizar(@PathVariable Long id, @RequestBody Tarea tarea){
        return tareaService.ActualizarTarea(id, tarea);
    }

    @DeleteMapping ("/{id}")
    public void Eliminar(@PathVariable Long id){
        tareaService.EliminarTarea(id);
    }

}
