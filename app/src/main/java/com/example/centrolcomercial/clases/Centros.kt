package com.example.centrolcomercial.clases

import java.io.Serializable


data class Centros(val nombre : String, val ubicacion : String, val tiendas : String,val listaTiendas : List<Tiendas>,val imagen : String) : Serializable
