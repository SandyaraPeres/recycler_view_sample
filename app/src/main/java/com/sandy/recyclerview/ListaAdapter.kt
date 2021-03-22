package com.sandy.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaAdapter(private val tabuada: MutableList<String>) : RecyclerView.Adapter<ListaAdapter.ListaViewHolder>() {

    class ListaViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textoTabuada : TextView = view.findViewById(R.id.txtItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaAdapter.ListaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent)
        return ListaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaAdapter.ListaViewHolder, position: Int) {
        //holder.textoTabuada.text = usuario[position].nome
        holder.textoTabuada.text = tabuada[position]
    }

    override fun getItemCount(): Int {
        return tabuada.size
    }
}