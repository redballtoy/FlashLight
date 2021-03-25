package com.example.redballtoy.flashlight

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.redballtoy.flashlight.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val flash = Flash(this,false)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btFlash.setOnClickListener { view ->
            when (flash.isFlash) {
                true -> {
                    flash.setFlash()
                    flash.isFlash = false
                    binding.btFlash.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ic_flash_on))
                    //binding.btFlash.text = "OFF"
                    //Toast.makeText(this, binding.btFlash.text, Toast.LENGTH_SHORT).show()
                }
                false -> {
                    flash.setFlash()
                    flash.isFlash = true
                    binding.btFlash.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ic_flash_off))
                    //binding.btFlash.text = "ON"
                    //Toast.makeText(this, binding.btFlash.text, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}