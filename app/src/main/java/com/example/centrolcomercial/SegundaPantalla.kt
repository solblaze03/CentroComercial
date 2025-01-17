package com.example.centrolcomercial

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.centrolcomercial.adapterandview.adapterTiendas
import com.example.centrolcomercial.clases.Centros
import com.example.centrolcomercial.clases.Tiendas
import com.example.centrolcomercial.databinding.ActivitySegundaPantallaBinding
import com.google.gson.Gson

class SegundaPantalla : AppCompatActivity() {

    private lateinit var binding : ActivitySegundaPantallaBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySegundaPantallaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titulo = findViewById<TextView>(R.id.Titulo_comercial)
        val intent = intent
        val centros = intent.extras?.getSerializable("Centros") as Centros
        cargarRecycle(centros.listaTiendas,centros.nombre,binding.TituloComercial)


    }
    fun cargarRecycle(list: List<Tiendas>, nombre: String, textView : TextView){
        val managerLayout = LinearLayoutManager(this)
        val recycler = findViewById<RecyclerView>(R.id.recyclerTienda)
        binding.recyclerTienda.layoutManager = managerLayout
        binding.recyclerTienda.adapter = adapterTiendas(list,nombre,textView)
    }
}