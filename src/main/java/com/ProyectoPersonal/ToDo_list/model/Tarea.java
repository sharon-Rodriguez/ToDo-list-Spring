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
    public long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public boolean isCompleta() { return completa; }

//    getter
    public long setId() { return id; }
    public String setTitulo() { return titulo; }
    public String setDescripcion() { return descripcion; }
    public void setCompleta(boolean completa) { this.completa = completa; }
}
