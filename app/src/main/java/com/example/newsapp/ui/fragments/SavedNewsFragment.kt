package com.example.newsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsapp.NewsViewModel
import com.example.newsapp.databinding.FragmentSavedNewsBinding
import com.example.newsapp.ui.NewsActivity

class SavedNewsFragment : Fragment() {
    private var _binding: FragmentSavedNewsBinding? = null
    private val binding get() = _binding!!
    lateinit var viewModel: NewsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSavedNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).newsViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}