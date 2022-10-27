package com.example.tugaskelompok

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class BioAdapter (private val bioList : ArrayList<Biodata>) : RecyclerView.Adapter<BioAdapter.MyViewHolder>(){
//    RecyclerView.Adapter<BioAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false))
        return itemView
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = bioList[position]
        holder.foto.setImageResource(curItem.foto)
        holder.namaMhs.text=curItem.nama
        holder.nimMhs.text=curItem.nim
        holder.kelasMhs.text=curItem.kelas
    }

    override fun getItemCount(): Int {
        return bioList.size
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val foto : ImageView = itemView.findViewById(R.id.iv_icon)
        val namaMhs : TextView = itemView.findViewById(R.id.tv_nama)
        val nimMhs : TextView = itemView.findViewById(R.id.tv_nim)
        val kelasMhs : TextView = itemView.findViewById(R.id.tv_kelas)
    }
}