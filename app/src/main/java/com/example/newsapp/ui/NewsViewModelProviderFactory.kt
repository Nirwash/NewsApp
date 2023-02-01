package com.example.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.NewsApp
import com.example.newsapp.repository.NewsRepository

class NewsViewModelProviderFactory(
    val app: NewsApp,
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        NewsViewModel(app, newsRepository) as T
}
