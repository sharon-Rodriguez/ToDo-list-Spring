package com.ProyectoPersonal.ToDo_list.service;

import com.ProyectoPersonal.ToDo_list.model.Tarea;
import com.ProyectoPersonal.ToDo_list.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> VerTareas(){
        return tareaRepository.findAll();
    }

    public Tarea CrearTarea (Tarea tarea){
        return tareaRepository.save(tarea);
    }

    public void EliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }

    public Tarea ActualizarTarea(Long id,Tarea tareaActualizada){
        Tarea tarea = tareaRepository.findById(id).orElseThrow();
        tarea.setTitulo(tareaActualizada.getTitulo());
        tarea.setDescripcion(tareaActualizada.getDescripcion());
        tarea.setCompleta(tareaActualizada.isCompleta());
        return tareaRepository.save(tarea);
    }

}
