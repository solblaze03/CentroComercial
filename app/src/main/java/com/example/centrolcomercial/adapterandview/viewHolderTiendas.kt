package com.example.centrolcomercial.adapterandview

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.centrolcomercial.R
import com.example.centrolcomercial.SegundaPantalla
import com.example.centrolcomercial.clases.Tiendas

class viewHolderTiendas (view : View) : ViewHolder(view) {

    val titulo = view.findViewById<TextView>(R.id.TituloTienda)
    val descripcion = view.findViewById<TextView>(R.id.tiendasdelcentro)


    fun render(tienda : Tiendas,nombre : String,tituloCentroComercial: TextView){
        titulo.text = tienda.nombre
        //tituloCentro.text = nombre
        tituloCentroComercial.text = nombre

        descripcion.text = tienda.descripcion



    }

}