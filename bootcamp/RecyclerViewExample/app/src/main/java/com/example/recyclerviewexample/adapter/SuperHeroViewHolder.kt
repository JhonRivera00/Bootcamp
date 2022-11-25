package com.example.recyclerviewexample.adapter

import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.SuperHero
import com.example.recyclerviewexample.SuperHeroProvider
import com.example.recyclerviewexample.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, ClickListener:(SuperHero)->Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superHero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener{ ClickListener(superHeroModel)}
    }
}