package com.katran.mylearningapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.katran.mylearningapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fotoVisibilitySwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.myFoto.visibility = View.VISIBLE
            } else {
                binding.myFoto.visibility = View.INVISIBLE
            }
        }

    }

}