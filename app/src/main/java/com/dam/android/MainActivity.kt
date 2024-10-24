package com.dam.android

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerViewanimales: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerViewanimales = findViewById(R.id.recyclerViewPeliculas)
        recyclerViewanimales.layoutManager = LinearLayoutManager(this)
// La línea que divide los elementos
        recyclerViewanimales.addItemDecoration(
            DividerItemDecoration(
                this@MainActivity,
                LinearLayoutManager.VERTICAL
            )
        )
        val animales = ArrayList<Animal>()
        animales.add(Animal("Conejo", "Herbívoro", "Vivíparo", "Herbívoro", "Vivíparo"))
        animales.add(Animal("Gallina", "Omnívoro", "Ovíparo", "Omnívoro", "Ovíparo"))
        animales.add(Animal("Águila", "Carnívoro", "Ovíparo", "Carnívoro", "Ovíparo"))
        animales.add(Animal("Jirafa", "Herbívoro", "Vivíparo", "Herbívoro", "Vivíparo"))
        animales.add(Animal("Cocodrilo", "Carnívoro", "Ovíparo", "Carnívoro", "Ovíparo"))
        animales.add(Animal("Elefante", "Herbívoro", "Vivíparo", "Herbívoro", "Vivíparo"))
        animales.add(Animal("Gato", "Carnívoro", "Vivíparo", "Carnívoro", "Vivíparo"))
        animales.add(Animal("Ratón", "Omnívoro", "Vivíparo", "Omnívoro", "Vivíparo"))
        animales.add(Animal("Murciélago", "Omnívoro", "Vivíparo", "Omnívoro", "Vivíparo"))
        animales.add(Animal("Perro", "Carnívoro", "Vivíparo", "Carnívoro", "Vivíparo"))
        animales.add(Animal("Pingüino", "Carnívoro", "Ovíparo", "Carnívoro", "Ovíparo"))
        animales.add(Animal("Abeja", "Herbívoro", "Ovíparo", "Herbívoro", "Ovíparo"))
        val adaptadorRecyclerView = AdaptadorAnimal(animales)
// El adaptador que se encarga de toda la lógica
        recyclerViewanimales.setAdapter(adaptadorRecyclerView)
    }

}
