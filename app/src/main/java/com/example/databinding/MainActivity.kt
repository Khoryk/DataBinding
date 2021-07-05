package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person("Ali","abc12@gmail.com","942316-05-1643","28 Jln ABC")

            binding.personDetail = p

            /*binding.tvName.text = "ALi"
            binding.tvIC.text = "942316-05-1643"
            binding.tvAddress.text = "28 Jln ABC"
            binding.tvEmail.text = "abc12@gmail.com"*/
        }

        binding.btnSecond.setOnClickListener(){

            var p = Person( "Abu", "abu@gmail.com", "123456-05-1643", "30 Jln CDF")

            binding.personDetail = p

        }

        /*val btn : Button = findViewById(R.id.btnDisplay)

        btn.setOnClickListener(){
            findViewById<>()
        }*/
    }
}