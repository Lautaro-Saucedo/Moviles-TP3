package com.example.peliculas;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula implements Serializable {
    private String titulo;
    private int foto;
    private String descripcion;
    private String[] actores;
    private String director;

    public Pelicula(String titulo, int foto, String descripcion, String[] actores, String director) {
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getActores() {
        return actores;
    }

    public String actoresToString(){
        String s="";
        for(int i=0; i<actores.length;i++){
            if(i== actores.length-1){
                s+=actores[i];
            } else {
                s+=actores[i]+", ";
            }
        }
        return s;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
