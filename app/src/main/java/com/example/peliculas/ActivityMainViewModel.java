package com.example.peliculas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class ActivityMainViewModel extends AndroidViewModel {
    private MutableLiveData<List<Pelicula>> lista;
    public ActivityMainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Pelicula>> getPelicula(){
        if(lista == null){
            lista = new MutableLiveData<>();
        }
        return lista;
    }
    public void cargarLista(){
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        List<Pelicula> l = new ArrayList<>();
        l.add( new Pelicula("Duro de matar",R.drawable.p1,s,new String[]{"Bruce Willis","Alan Rickman"}, "John McTiernan") );
        l.add(new Pelicula("Terminator 2",R.drawable.p2,s,new String[]{"Arnold Schwarzenegger","Linda Hamilton"},"James Cameron"));
        l.add(new Pelicula("Avatar",R.drawable.p3,s,new String[]{"Sam Worthington","Zoe Saldana"},"James Cameron"));
        l.add(new Pelicula("Matrix",R.drawable.p4,s,new String[]{"Keanu Reeves","Laurence Fishburne"},"Hermanas Wachowski"));
        l.add(new Pelicula("El Señor de los Anillos: la Comunidad del Anillo",R.drawable.p5,s,new String[]{"Elijah Wood","Ian McKellen"},"Peter Jackson"));
        l.add(new Pelicula("Batman: el Regreso del Caballero Oscuro",R.drawable.p6,s,new String[]{"Peter Weller","Ariel Winter"},"Jay Oliva"));
        lista.setValue(l);
    }


}
