package com.example.peliculas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.peliculas.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ActivityMainViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ActivityMainViewModel.class);
        vm.getPelicula().observe(this, new Observer<List<Pelicula>>() {
            @Override
            public void onChanged(List<Pelicula> peliculas) {
                Adapter adapter = new Adapter(peliculas,MainActivity.this);
                GridLayoutManager glm = new GridLayoutManager(MainActivity.this,1,GridLayoutManager.HORIZONTAL,false);
                binding.rvLista.setAdapter(adapter);
                binding.rvLista.setLayoutManager(glm);
            }
        });
        vm.cargarLista();
    }
}