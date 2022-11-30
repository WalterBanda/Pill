package dev.medtracker.client.presentation.profile

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var binding: FragmentProfileBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        binding.editProfile.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(R.id.action_profileFragment_to_editProfileFragment)
        }

    }


}