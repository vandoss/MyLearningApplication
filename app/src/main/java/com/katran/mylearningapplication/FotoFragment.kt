package com.katran.mylearningapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.katran.mylearningapplication.databinding.FragmentFotoBinding

class FotoFragment : Fragment() {

     private var binding: FragmentFotoBinding? = null

     override fun onCreateView(
          inflater: LayoutInflater,
          container: ViewGroup?,
          savedInstanceState: Bundle?
     ): View? {
          binding = FragmentFotoBinding.inflate(inflater, container, false)

          return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
     }

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
          super.onViewCreated(view, savedInstanceState)

          binding?.fotoVisibilitySwitch?.setOnCheckedChangeListener { _, isChecked ->
               if (isChecked) {
                    binding?.myFoto?.visibility = View.VISIBLE
               } else {
                    binding?.myFoto?.visibility = View.INVISIBLE
               }
          }
     }
}