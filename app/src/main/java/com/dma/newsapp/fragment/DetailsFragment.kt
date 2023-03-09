package com.dma.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.dma.newsapp.R
import com.dma.newsapp.databinding.FragmentDetailsBinding
import com.dma.newsapp.retrofit.response.Article

class DetailsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentDetailsBinding.inflate(inflater,container,false)
        val data = requireArguments()["article"] as Article

        binding.articles = data

        Glide.with(binding.root).load(data.urlToImage).into(binding.detailsImage)

        return binding.root
    }



}