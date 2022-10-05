package com.example.homework6_3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6_3.databinding.ItemMusicBinding

class MusicAdapter(private val data: ArrayList<MusicModel>, private val onClick: (String) -> Unit):
    RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemMusicBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(musicModel: MusicModel) {
            binding.nameOfSong.text = musicModel.name
            binding.number.text = musicModel.number.toString()
            binding.singer.text = musicModel.singer
            binding.time.text = musicModel.time

            itemView.setOnClickListener {
                onClick(musicModel.name)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}