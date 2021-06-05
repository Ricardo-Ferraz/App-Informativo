package com.example.appinformativo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button1).setOnClickListener {
            findNavController().navigate(R.id.action_ThreeFragment_to_SecondFragment)
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            findNavController().navigate(R.id.action_ThreeFragment_to_FirstFragment)
        }
    }
}