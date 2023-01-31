package com.example.newsapp.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.ActivityNewsBinding
import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.repository.NewsRepository

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    private val newsRepository: NewsRepository by lazy {
        NewsRepository(ArticleDatabase(this))
    }
    private val factory: NewsViewModelProviderFactory by lazy {
        NewsViewModelProviderFactory(newsRepository)
    }
    val newsViewModel: NewsViewModel by lazy {
        ViewModelProvider(this, factory)[NewsViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("viewModel", "from activity onCreate")

        val newsNavHostFragment = findViewById<View>(R.id.newsNavHostFragment)
        binding.bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())

    }
}