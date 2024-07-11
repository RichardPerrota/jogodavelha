package com.example.jogo_da_velha_richard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jogo_da_velha_richard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonpvp.setOnClickListener {
            val intent = Intent(this, PessoaActivity::class.java)
            startActivity(intent)
        }
        binding.buttoncpu.setOnClickListener {
            val intent = Intent(this, MaquinaActivity::class.java)
            startActivity(intent)
        }
    }
}