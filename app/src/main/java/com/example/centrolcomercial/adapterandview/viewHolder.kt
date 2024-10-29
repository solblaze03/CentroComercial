package com.example.centrolcomercial.adapterandview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.centrolcomercial.R
import com.example.centrolcomercial.clases.Centros

class viewHolder (val view: View) : ViewHolder(view){

    val nombre = view.findViewById<TextView>(R.id.titulo)
    val ubicación = view.findViewById<TextView>(R.id.direccion)
    val tiendas = view.findViewById<TextView>(R.id.Tiendas)
    val imagen = view.findViewById<ImageView>(R.id.Imagen)
    val card = view.findViewById<CardView>(R.id.centros)

    fun render(centro: Centros, function: (centros: Centros) -> Unit){
        nombre.text = centro.nombre
        ubicación.text = centro.ubicacion
        tiendas.text = centro.tiendas
        Glide.with(view.context).load(centro.imagen).into(imagen)
        card.setOnClickListener {
            function(centro)

        }
    }
}