package com.dam.android

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderAnimal(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewAnimal: TextView
    val textViewAlimentacion: TextView
    val textViewReproduccion: TextView
    val textViewTipo_alim: TextView
    val textViewVivip_o_ovip: TextView

    init {
        textViewAnimal = itemView.findViewById(R.id.filaAnimal)
        textViewAlimentacion = itemView.findViewById(R.id.filaAlimentacion)
        textViewReproduccion = itemView.findViewById(R.id.filaReproduccion)
        textViewTipo_alim = itemView.findViewById(R.id.filaTipo_alim)
        textViewVivip_o_ovip = itemView.findViewById(R.id.filaVivip_o_ovip)
    }
}
