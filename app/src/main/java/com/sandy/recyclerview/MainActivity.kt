package com.sandy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //COLLECTIONS DO KOTLIN

        //LISTAS
        val listaImutavel = listOf<Int>(1, 2, 3, 3, 2, 1)
        val listaMutable = mutableListOf<Int>(1, 2, 3, 3, 2, 1)
        listaMutable.add(4)

        //SET
        val setImutavel = setOf<Int>(1, 2, 3, 3, 2, 1)
        val setMutavel = mutableSetOf<Int>(1, 2, 3, 3, 2, 1)
        setMutavel.add(4)
        setMutavel.add(4)

        //MAP
        val mapImutavel = mapOf<Int, String>(1 to "Maria", 2 to "João", 3 to "Henrique")
        val mapMutavel = mutableMapOf<Int, String>(1 to "Maria", 2 to "João", 3 to "Henrique")
        mapMutavel[4] = "Ana"

        val tabuada = mutableListOf("4 X 1 = 4", "4 X 2 = 8")

        val rvTabuada = findViewById<RecyclerView>(R.id.lista)
        rvTabuada.adapter = ListaAdapter(tabuada)

        //1. LinearLayoutManager
        //2. GridLayoutManager
        //3. StaggeredGridLayoutManager
        rvTabuada.layoutManager = LinearLayoutManager(this)
    }
}