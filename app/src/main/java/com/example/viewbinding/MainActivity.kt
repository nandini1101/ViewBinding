package com.example.viewbinding

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    //here if we click it opens XML file as we have dont build features copy paste in build gralde

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding function

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //here it got the path of XML file

        binding.button.setOnClickListener{
            if (binding.checkBox.isChecked){
                //open a new screen
                val intent = Intent(this,vb1::class.java)
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.BLUE)
                startActivity(intent)
            }
            else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Please accept the T&C",Toast.LENGTH_SHORT).show()
            }
        }





    }
}