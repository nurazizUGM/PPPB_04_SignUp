package com.example.tugas

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val fullname = binding.inputFullname.text.toString()
            val username = binding.inputUsername.text.toString()
            val password = binding.inputPassword.text.toString()

            val msg =
                "Email: $email | Fullname: $fullname \nUsername: $username | Password: $password"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }
}