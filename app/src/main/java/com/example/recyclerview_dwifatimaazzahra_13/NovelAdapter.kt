package com.example.recyclerview_dwifatimaazzahra_13

import android.content.Context
import android.location.GnssAntennaInfo
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class NovelAdapter (private val context: Context, private val novelsirhayani: List<NovelSirhayani>, val listener: (NovelSirhayani) -> Unit)
    : RecyclerView.Adapter<NovelAdapter.NovelViewHolder>(){
    class NovelViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgNovel = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleNovel= view.findViewById<TextView>(R.id.tv_item_name)
        val descNovel = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(novel: NovelSirhayani, listener: (NovelSirhayani) -> Unit){
            imgNovel.setImageResource(novel.imgNovel)
            titleNovel.text = novel.titleNovel
            descNovel.text = novel.descNovel
            itemView.setOnClickListener{
                listener(novel)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelViewHolder {
        return NovelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.novel_sirhayani, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NovelViewHolder, position: Int) {
        holder.bindView(novelsirhayani[position], listener)
    }

    override fun getItemCount(): Int = novelsirhayani.size
    }
