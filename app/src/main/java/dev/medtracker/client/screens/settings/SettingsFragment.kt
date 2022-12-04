package dev.medtracker.client.screens.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private lateinit var binding: FragmentSettingsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
    }

}