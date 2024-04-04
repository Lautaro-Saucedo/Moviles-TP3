package com.example.peliculas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.peliculas.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityDetalleBinding binding= ActivityDetalleBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        ActivityDetalleViewModel vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ActivityDetalleViewModel.class);
        vm.getPelicula().observe(this, new Observer<Pelicula>() {
            @Override
            public void onChanged(Pelicula p) {
                binding.ivDetalleFoto.setImageResource(p.getFoto());
                binding.tvDetalleActores.setText(p.actoresToString());
                binding.tvDetalleDescripcion.setText(p.getDescripcion());
                binding.tvDetalleDirector.setText(p.getDirector());
                binding.tvDetalleTitulo.setText(p.getTitulo());
            }
        });
        vm.mostrar(getIntent());
    }
}