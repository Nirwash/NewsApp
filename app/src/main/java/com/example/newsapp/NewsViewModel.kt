package com.example.newsapp

import androidx.lifecycle.ViewModel
import com.example.newsapp.repository.NewsRepository

class NewsViewModel(
    private val newsRepository: NewsRepository
) : ViewModel() {
}