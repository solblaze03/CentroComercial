package com.example.centrolcomercial.adapterandview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.centrolcomercial.R
import com.example.centrolcomercial.clases.Centros
import com.example.centrolcomercial.clases.Tiendas

class adapterTiendas(val Tienda: List<Tiendas>,val tienda : String,val tituloComercial : TextView) : RecyclerView.Adapter<viewHolderTiendas>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolderTiendas {
        val layoutInflater = LayoutInflater.from(parent.context)
        return viewHolderTiendas(layoutInflater.inflate(R.layout.cardtiendas,parent, false))
    }

    override fun onBindViewHolder(holder: viewHolderTiendas, position: Int) {
        val item = Tienda[position]
        return holder.render(item,tienda,tituloComercial)
    }

    override fun getItemCount(): Int {
        return Tienda.size
    }
}