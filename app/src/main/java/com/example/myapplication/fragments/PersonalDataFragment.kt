package com.example.myapplication.fragments

import android.graphics.ColorSpace.Model
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.myapplication.model.PersonModel
import com.example.myapplication.databinding.FragmentPersonalDataBinding
import com.example.myapplication.extensions.text

class PersonalDataFragment : Fragment() {

    private var _binding: FragmentPersonalDataBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        group: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPersonalDataBinding.inflate(inflater, group, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            val model = PersonModel(
                name = binding.tilNome.text,
                age = binding.tilAge.text.toInt()
            )
            val directions = PersonalDataFragmentDirections.goToAddressFragment(model)
            findNavController().navigate(directions)


        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}