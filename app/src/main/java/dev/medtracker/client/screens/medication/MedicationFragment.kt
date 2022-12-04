package dev.medtracker.client.screens.medication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentMedicationBinding

class MedicationFragment : Fragment(R.layout.fragment_medication) {
    private lateinit var binding: FragmentMedicationBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMedicationBinding.bind(view)
    }
}