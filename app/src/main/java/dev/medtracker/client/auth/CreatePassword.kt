package dev.medtracker.client.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentCreatePasswordBinding
import dev.medtracker.client.screens.profile.launchSuccessDialog

class CreatePassword : Fragment(R.layout.fragment_create_password) {

    private lateinit var binding: FragmentCreatePasswordBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val context = requireContext()
        binding = FragmentCreatePasswordBinding.bind(view)
        binding.createPasswordBtn.setOnClickListener {
            launchSuccessDialog(context, R.layout.dialog_password_created_successfully)
        }
    }

}