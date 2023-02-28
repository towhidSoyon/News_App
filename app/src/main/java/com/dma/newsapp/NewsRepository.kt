package com.dma.newsapp

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.dma.newsapp.paging.NewsPagingSource
import com.dma.newsapp.retrofit.response.Article
import com.dma.newsapp.retrofit.response.NewsInterface

class NewsRepository(val newsInterface: NewsInterface) {

    fun getAllNewsStream(): LiveData<PagingData<Article>> = Pager(
        config = PagingConfig(
            20,5, enablePlaceholders = false
        ), pagingSourceFactory = {
            NewsPagingSource(newsInterface)
        }
    ).liveData
}