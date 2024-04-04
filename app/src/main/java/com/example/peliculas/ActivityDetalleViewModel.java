package com.example.peliculas;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ActivityDetalleViewModel extends AndroidViewModel {
    private MutableLiveData<Pelicula> pelicula;
    public ActivityDetalleViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Pelicula> getPelicula(){
        if(pelicula==null){
            pelicula = new MutableLiveData<>();
        }
        return pelicula;
    }
    public void mostrar(Intent intent){
        Pelicula p = (Pelicula) intent.getSerializableExtra("pelicula");
        if(pelicula!=null) {
            pelicula.setValue(p);
        }
    }

}
