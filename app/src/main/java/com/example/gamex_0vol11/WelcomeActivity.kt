package com.example.gamex_0vol11

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View

class WelcomeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val button = findViewById<View>(R.id.welcome)

        var mPlayer: MediaPlayer? = null
        mPlayer = MediaPlayer.create(this, R.raw.intro)
        mPlayer.setVolume(0.2f, 0.2f)
        mPlayer!!.start()

        button.setOnClickListener{
            Log.d("ZBN", "Мы в кнопке")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}