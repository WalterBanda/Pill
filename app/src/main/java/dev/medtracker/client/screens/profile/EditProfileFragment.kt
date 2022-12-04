package dev.medtracker.client.screens.profile

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import dev.medtracker.client.R
import dev.medtracker.client.databinding.FragmentEditProfileBinding


class EditProfileFragment : Fragment(R.layout.fragment_edit_profile) {
    private lateinit var binding: FragmentEditProfileBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val context = requireContext()
        binding = FragmentEditProfileBinding.bind(view)
        binding.updateProfile.setOnClickListener {
            launchSuccessDialog(context)
        }
    }
}


fun launchSuccessDialog(context: Context) {
    val dialog = Dialog(context)
    dialog.setContentView(R.layout.dialog_profile_update_success)
    dialog.setCancelable(false)
    dialog.setCanceledOnTouchOutside(false)
    dialog.show()
    val backButton = dialog.findViewById<Button>(R.id.back_button)
    backButton.setOnClickListener {
        dialog.dismiss()
    }
}