package com.example.ejercicio06recyclerview;

import android.os.Bundle;

import com.example.ejercicio06recyclerview.adapter.ComprasAdapter;
import com.example.ejercicio06recyclerview.modelos.ListaCompra;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;



import com.example.ejercicio06recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    private ArrayList<ListaCompra> comraList;
    private ComprasAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        comraList=new ArrayList<>();
        crearLista();

        adapter = new ComprasAdapter(comraList,R.layout.compras_view_model,MainActivity.this);
        binding.contentMain.contenedor.setAdapter(adapter);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        binding.contentMain.contenedor.setLayoutManager(layoutManager);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void crearLista() {
        for (int i = 0; i < 1000; i++) {
            comraList.add(new ListaCompra("Producto"+i,"Precio"+i));

        }
    }


}