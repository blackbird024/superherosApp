package com.example.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(
        superheroItemResponse: SuperheroItemResponse,
        onItemSelected: (String) -> Unit
    ) {
        binding.tvSuperheroName.text = superheroItemResponse.superheroName


        // Cargamos la imagen(URL) con la biblioteca Picasso
        Picasso.get().load(superheroItemResponse.superheroImg.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener{onItemSelected(superheroItemResponse.superheroId)}

    }
}