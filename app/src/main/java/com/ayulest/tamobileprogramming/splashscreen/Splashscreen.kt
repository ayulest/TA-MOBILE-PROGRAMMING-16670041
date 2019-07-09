package com.ayulest.tamobileprogramming.splashscreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ayulest.tamobileprogramming.R
import com.ayulest.tamobileprogramming.user_interface.activity.DataActivity
import java.util.*
import kotlin.concurrent.schedule

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(3000) {
            val intent = Intent(applicationContext, DataActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}