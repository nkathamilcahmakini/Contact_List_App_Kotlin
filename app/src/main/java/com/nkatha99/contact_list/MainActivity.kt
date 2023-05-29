package com.nkatha99.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nkatha99.contact_list.databinding.ActivityMainBinding
import com.nkatha99.contact_list.databinding.ContactsListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        diplayContacts()

    }

    fun diplayContacts() {
        val contact1 = contactData("", "Nkatha", "0712345678", "nkatha@gmail.com")
        val contact2 = contactData("", "Rachel", "0712345678", "rachel@gmail.com")
        val contact3 = contactData("", "Bridget", "0712345678", "bridget@gmail.com")
        val contact4 = contactData("", "Rebecca", "0712345678", "rebecca@gmail.com")
        val contact5 = contactData("", "Sally", "0712345678", "sally@gmail.com")
        val contact6 = contactData("", "Kimathi", "0712345678", "kimathi@gmail.com")
        val contact7 = contactData("", "Nelson", "0712345678", "nelson@gmail.com")
        val contact8 = contactData("", "Bonnke", "0712345678", "bonnke@gmail.com")
        val contact9 = contactData("", "Moraa", "0712345678", "moraa@gmail.com")
        val contact10 = contactData("", "Favour", "0712345678", "favour@gmail.com")
        val contactList = listOf(
            contact1,
            contact2,
            contact3,
            contact4,
            contact5,
            contact6,
            contact7,
            contact8,
            contact9,
            contact10
        )
        val contAdapter = ContactsAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contAdapter

    }
}