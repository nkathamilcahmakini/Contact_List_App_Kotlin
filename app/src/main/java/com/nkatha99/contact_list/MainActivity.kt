package com.nkatha99.contact_list

import android.content.Intent
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
        binding.fabaddContact.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        diplayContacts()

    }

    fun diplayContacts() {
        val contact = ContactData("Nkatha", "0712345678", "nkatha@gmail.com","https://images.unsplash.com/photo-1542727313-4f3e99aa2568?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact1= ContactData("Rachel", "0722345678", "rachel@gmail.com", "https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact2 = ContactData("Rachel", "0712345678", "rachel@gmail.com", "https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60" )
        val contact3 = ContactData("Bridget", "0712345678", "bridget@gmail.com", "https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact4 = ContactData("Rebecca", "0712345678", "rebecca@gmail.com", "https://images.unsplash.com/photo-1591727884968-cc11135a19b3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fFByb2ZpbGUlMjBwaWN0dXJlcyUyMGZvciUyMGJsYWNrc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact5 = ContactData("Sally", "0712345678", "sally@gmail.com", "https://images.unsplash.com/photo-1527203561188-dae1bc1a417f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fFByb2ZpbGUlMjBwaWN0dXJlcyUyMGZvciUyMGJsYWNrc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact6 = ContactData("Kimathi", "0712345678", "kimathi@gmail.com", "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fFByb2ZpbGUlMjBwaWN0dXJlcyUyMGZvciUyMGJsYWNrc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contact7 = ContactData("Nelson", "0712345678", "nelson@gmail.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact8 = ContactData("Bonnke", "0712345678", "bonnke@gmail.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact9 = ContactData("Moraa", "0712345678", "moraa@gmail.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact10 = ContactData("Favour", "0712345678", "favour@gmail.com", "https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8UHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contactList = listOf(contact, contact1, contact2, contact3, contact4,
                                 contact5, contact6, contact7, contact9, contact10)
        val contAdapter = ContactsAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contAdapter

    }
}