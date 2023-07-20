package com.example.gamex_0vol11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var player = "0"
        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)
        val b5: Button = findViewById(R.id.b5)
        val b6: Button = findViewById(R.id.b6)
        val b7: Button = findViewById(R.id.b7)
        val b8: Button = findViewById(R.id.b8)
        val b9: Button = findViewById(R.id.b9)
        val t1: TextView = findViewById(R.id.t1)
        val t2: TextView = findViewById(R.id.t2)
        val t3: TextView = findViewById(R.id.t3)

        fun chPlayer() {
            if (player == "X"){
                player = "0"
                t1.text = "Player 1 moves (X)"
            } else {
                player = "X"
                t1.text = "Player 2 moves (0)"
            }
        }

        fun winner() {
            t2.visibility = View.VISIBLE
            t2.text = "Winner player - $player"
            t1.visibility = View.INVISIBLE
            t3.visibility = View.VISIBLE
            t3.setOnClickListener{
                b1.text = ""
                b2.text = ""
                b3.text = ""
                b4.text = ""
                b5.text = ""
                b6.text = ""
                b7.text = ""
                b8.text = ""
                b9.text = ""
                player = "0"
                t1.visibility = View.VISIBLE
                t2.visibility = View.INVISIBLE
                t1.text = "Player 1 starts the game (X)"

            }
        }

        b1.setOnClickListener {
            if (b1.text == "") {
                chPlayer()
                b1.text = player
                if (
                    b1.text == b2.text && b1.text == b3.text ||
                    b1.text == b4.text && b1.text == b7.text ||
                    b1.text == b5.text && b1.text == b9.text
                ) {
                    winner()
                }
            }
        }
        b2.setOnClickListener {
            if (b2.text == "") {
                chPlayer()
                b2.text = player
                if (
                    b2.text == b3.text && b2.text == b1.text ||
                    b2.text == b5.text && b2.text == b8.text
                ) {
                    winner()
                }
            }
        }
        b3.setOnClickListener {
            if (b3.text == "") {
                chPlayer()
            }
            b3.text = player
            if (
                b3.text == b2.text && b3.text == b1.text ||
                b3.text == b6.text && b3.text == b9.text ||
                b3.text == b5.text && b3.text == b7.text
            ) {
                winner()
            }
        }
        b4.setOnClickListener {
            if (b4.text == "") {
                chPlayer()
                b4.text = player
                if (
                    b4.text == b5.text && b4.text == b6.text ||
                    b4.text == b1.text && b4.text == b7.text
                ) {
                    winner()
                }
            }
        }
        b5.setOnClickListener {
            if (b5.text == "") {
                chPlayer()
                b5.text = player
                if (
                    b5.text == b4.text && b5.text == b6.text ||
                    b5.text == b2.text && b5.text == b8.text ||
                    b5.text == b1.text && b5.text == b9.text ||
                    b5.text == b7.text && b5.text == b3.text
                ) {
                    winner()
                }
            }
        }
        b6.setOnClickListener {
            if (b6.text == "") {
                chPlayer()
                b6.text = player
                if (
                    b6.text == b5.text && b6.text == b4.text ||
                    b6.text == b3.text && b6.text == b9.text
                ) {
                    winner()
                }
            }
        }
        b7.setOnClickListener {
            if (b7.text == "") {
                chPlayer()
                b7.text = player
                if (
                    b7.text == b4.text && b7.text == b1.text ||
                    b7.text == b8.text && b7.text == b9.text ||
                    b7.text == b5.text && b7.text == b3.text
                ) {
                    winner()
                }
            }
        }
        b8.setOnClickListener {
            if (b8.text == "") {
                chPlayer()
                b8.text = player
                if (b8.text == b7.text && b8.text == b9.text ||
                    b8.text == b5.text && b8.text == b2.text
                ) {
                    winner()
                }
            }
        }
        b9.setOnClickListener {
            if (b9.text == "") {
                chPlayer()
                b9.text = player
                if (
                    b9.text == b8.text && b9.text == b7.text ||
                    b9.text == b6.text && b9.text == b3.text ||
                    b9.text == b5.text && b9.text == b1.text
                ) {
                    winner()
                }
            }
        }
    }
}
