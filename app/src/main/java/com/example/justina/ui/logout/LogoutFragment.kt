package com.example.justina.ui.logout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.replace
import androidx.lifecycle.ViewModelProvider
import com.example.justina.MainActivity
import com.example.justina.MainActivity2
import com.example.justina.NavigationActivity
import com.example.justina.R
import com.example.justina.databinding.FragmentHomeBinding
import com.example.justina.ui.home.HomeViewModel

class LogoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_logout,container,false)
        val btn1 = view.findViewById<Button>(R.id.btn1)
        val view1 = view.findViewById<TextView>(R.id.view1)

        btn1.setOnClickListener {
            Toast.makeText(context, "Please come back again", Toast.LENGTH_LONG).show()
            val intent  = Intent(activity, MainActivity::class.java)
            startActivity(intent)
            }
        return view
        }







        }




