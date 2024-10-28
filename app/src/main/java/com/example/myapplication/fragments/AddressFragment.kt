package com.example.myapplication.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.myapplication.databinding.FragmentAddressBinding
import com.example.myapplication.extensions.text

class AddressFragment : Fragment() {

    private var _binding: FragmentAddressBinding? = null
    private val binding get() = _binding!!

    private val args by navArgs<AddressFragmentArgs>()

    companion object {
        private const val TAG = "AddressFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "onViewCreated: ${args.model}")

        binding.btnNext.setOnClickListener {
            val model = args.model.copy(
                street = binding.tilStreet.editText?.text.toString(),
                number = binding.tilNumber.editText?.text.toString().toIntOrNull() ?: 0
            )

            val directions = AddressFragmentDirections.goToResumeFragment(model)
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
