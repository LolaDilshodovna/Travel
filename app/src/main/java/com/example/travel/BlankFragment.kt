package com.example.travel

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.travel.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBlankBinding.inflate(inflater, container, false)

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment_to_fragment2)
        }
        return binding.root
    }


}