package com.example.homework6_3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework6_3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() , onClick {

    private lateinit var binding: FragmentSecondBinding
    private val data = ArrayList<MusicModel>()
    private lateinit var adapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initData()
    }

    private fun loadData() {
        data.add(MusicModel("Jasmine", "DPR LIVE", "3:12", 1))
        data.add(MusicModel("Cheese & Wine", "DPR LIVE", "3:12", 2))
        data.add(MusicModel("Martini Blue", "DPR LIVE", "3:16", 3))
        data.add(MusicModel("Jam & Butterfly", "DPR LIVE", "3:15", 4))
        data.add(MusicModel("Text me", "DPR LIVE", "3:17", 5))
        data.add(MusicModel("To myself", "DPR LIVE", "3:14", 6))
        data.add(MusicModel("thirst", "DPR LIVE", "3:15", 7))
    }

    private fun initData() {
        adapter = MusicAdapter(data , this::onClick)
        binding.recycler.adapter = adapter
    }

    override fun onClick(name: String) {
        Intent(requireContext() , SecondActivity::class.java).apply {
            putExtra("key" , name)
            startActivity(this)
        }
    }
}
