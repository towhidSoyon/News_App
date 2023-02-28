package com.dma.newsapp.di

import com.dma.newsapp.retrofit.response.NewsInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DiModules {

    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun provideNewsInterface(retrofit: Retrofit):NewsInterface{
        return retrofit.create(NewsInterface::class.java)
    }

}