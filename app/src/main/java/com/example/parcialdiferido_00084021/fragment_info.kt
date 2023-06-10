package com.example.parcialdiferido_00084021

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class fragment_info : Fragment() {

    private lateinit var buttonAdd: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    private fun bind() {
        buttonAdd = view?.findViewById(R.id.button_add_hotel) as Button
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind()
        buttonAdd.setOnClickListener{
            it.findNavController().navigate(R.id.action_fragment_info_to_fragment_add)
        }
    }


}