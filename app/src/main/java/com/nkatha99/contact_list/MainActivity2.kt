package com.nkatha99.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nkatha99.contact_list.databinding.ActivityMain2Binding
import com.nkatha99.contact_list.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ivarrowBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
//        binding.btnSave.setOnClickListener {
//            validateAddContact()
//            clearErrors()
//        }
    }

    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener {
            validateAddContact()
            clearErrors()
        }
    }
    fun validateAddContact() {
        val name = binding.etName.text.toString()
        val phone = binding.etphoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (name.isBlank()) {
            binding.etName.error = "Name is required"
            error = true
        }
        if (phone.isBlank()) {
            binding.etphoneNumber.error = "Contact is required"
            error = true
        }
        if (email.isBlank()) {
            binding.etEmail.error = "Email is required"
            error = true
        }
        if (!error) {
            Toast.makeText(
                this, "$name, $phone, $email",
                Toast.LENGTH_LONG
            ).show()

        }
    }
    fun clearErrors() {
        binding.tilName.error = null
        binding.tilphoneNumber.error = null
        binding.tilEmail.error = null

    }
}