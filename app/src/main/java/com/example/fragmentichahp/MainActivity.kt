package com.example.fragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentichahp.R
import com.example.fragmentichahp.busanaFragment
import com.example.fragmentichahp.kulinerFragment
import com.example.fragmentichahp.pplgFragment
import com.example.fragmentichahp.toFragment
import com.example.fragmentichahp.tpflFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pplg = findViewById<Button>(R.id.pplgFragment)
        val to = findViewById<Button>(R.id.toFragment)
        val kuliner = findViewById<Button>(R.id.kulinerFragment)
        val busana = findViewById<Button>(R.id.busanaFragment)
        val tpfl = findViewById<Button>(R.id.tpflFragment)

        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer , pplgFragment())
            fragmentTransaction.commit()
        }
        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, toFragment())
            fragmentTransaction.commit()
        }
        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, kulinerFragment())
            fragmentTransaction.commit()
        }
        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, busanaFragment())
            fragmentTransaction.commit()
        }
        tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, tpflFragment())
            fragmentTransaction.commit()
        }
    }
}