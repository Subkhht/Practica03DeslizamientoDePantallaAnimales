package com.dam.android

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdaptadorAnimal(datosAnimales: MutableList<Animal>) : RecyclerView.Adapter<ViewHolderAnimal>() {
    private lateinit var animales: MutableList<Animal>


    init {
        this.animales=datosAnimales
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimal {
        // inflamos la vista (fila_pelicula.xml)
        val vista: View = LayoutInflater.from(parent.context).inflate(R.layout.fila_animal, parent, false)
        // Crear el viewholder a partir de esta vista.
        val viewHolder = ViewHolderAnimal(vista)
        return viewHolder
    }


    override fun getItemCount(): Int {


        return this.animales.size
    }


    override fun onBindViewHolder(holder: ViewHolderAnimal, position: Int) {
        // Dibujar la fila de la peli con los datos de la peli actualmente solicitada según la variable position
        val animal: Animal = this.animales[position]
        holder.textViewAnimal.text = animal.animal
        holder.textViewAlimentacion.text=animal.alimentacion
        holder.textViewReproduccion.text= animal.reproduccion
        holder.textViewTipo_alim.text= animal.tipo_alim
        holder.textViewVivip_o_ovip.text= animal.vivip_o_ovip
        Log.d("recycler", position.toString());
    }
}
