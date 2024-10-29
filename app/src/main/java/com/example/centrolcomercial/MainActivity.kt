package com.example.centrolcomercial

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.centrolcomercial.adapterandview.adapterCentros
import com.example.centrolcomercial.adapterandview.listaCentros
import com.example.centrolcomercial.clases.Centros
import com.example.centrolcomercial.databinding.ActivityMainBinding
import com.google.gson.Gson



class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    private var posicion = 0
    private var player : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        CargarRecycler()
        Log.i("aviso","Oncreate")

    }
    fun cambioPantalla(centro : Centros){
        val intent = Intent(this,SegundaPantalla::class.java)
        intent.putExtra("Centros",centro)
        startActivity(intent)

    }

    fun CargarRecycler(){
        val managerLayout = LinearLayoutManager(this)
        binding.Recycler.layoutManager = managerLayout
        binding.Recycler.adapter = adapterCentros(listaCentros.centro) {item -> cambioPantalla(item)}
    }

    override fun onStart() {
        super.onStart()
        player = MediaPlayer.create(this,R.raw.never)
        player!!.isLooping = true
        Log.i("aviso","Onstart")
    }

    override fun onResume() {
        super.onResume()
        player!!.seekTo(posicion)
        player!!.start()
        Log.i("aviso","OnResume")
    }

    override fun onPause() {
        super.onPause()
        player!!.pause()
        if (player != null){
            posicion = player!!.currentPosition
        }
        Log.i("aviso","onPause")
    }


    override fun onStop() {
        super.onStop()
        player!!.pause()

        Log.i("aviso","OnStop")


    }

    override fun onDestroy() {
        super.onDestroy()
        posicion = player!!.currentPosition
        player!!.stop()
        player!!.release()
        player = null
        Log.i("aviso","Ondestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("aviso","Onrestart")
    }
}