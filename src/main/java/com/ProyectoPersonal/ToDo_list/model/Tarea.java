package com.ProyectoPersonal.ToDo_list.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tareas")

public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String descripcion;
    private boolean completa;

    public Tarea() {
    }

//    setter
    public void setId(long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCompleta(boolean completa) { this.completa = completa; }


//    getter
    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public boolean isCompleta() { return completa; }
}
