package com.example.centrolcomercial.adapterandview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.centrolcomercial.R
import com.example.centrolcomercial.clases.Centros

class adapterCentros(carros: List<Centros>, val function: (centros : Centros) -> Unit) : RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return viewHolder(layoutInflater.inflate(R.layout.card,parent, false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item = listaCentros.centro[position]
        return holder.render(item, function )
    }

    override fun getItemCount(): Int {
        return listaCentros.centro.size
    }
}