package com.example.gdcbitirmeprojesi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val button1: Button = findViewById(R.id.button1)
        //button1.setOnClickListener {
        //    changeFragment(EventFragment())
        //}
    }
    // fun changeFragment(fragment: Fragment) {
    //    val fragmentTransaction = supportFragmentManager.beginTransaction()
    //    fragmentTransaction.replace(R.id.frameLayout, fragment)
    //    fragmentTransaction.commit()
    //}
}