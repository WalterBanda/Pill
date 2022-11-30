package dev.medtracker.client.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
    }
}
