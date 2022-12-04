package dev.medtracker.client.auth

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentAuthCreatePasswordBinding
import dev.medtracker.client.screens.profile.launchSuccessDialog

class CreatePassword : Fragment(R.layout.fragment_auth_create_password) {

    private lateinit var binding: FragmentAuthCreatePasswordBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val context = requireContext()
        binding = FragmentAuthCreatePasswordBinding.bind(view)
        binding.createPasswordBtn.setOnClickListener {
            launchSuccessDialog(context, R.layout.dialog_password_created_successfully)
        }
    }

}