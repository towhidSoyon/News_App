package com.dma.newsapp.adapters

import com.dma.newsapp.retrofit.response.Article

interface AdapterClickListioners {

    fun clickListener(article: Article)
}