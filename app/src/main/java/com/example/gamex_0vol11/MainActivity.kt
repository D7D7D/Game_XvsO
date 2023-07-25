package com.example.gamex_0vol11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var xOr0 = 2.0f

        val emptyPlace = 0.0f       // 0.0f - null, for battlefield

        val b1: ImageView = findViewById(R.id.b1)
        val b2: ImageView = findViewById(R.id.b2)
        val b3: ImageView = findViewById(R.id.b3)
        val b4: ImageView = findViewById(R.id.b4)
        val b5: ImageView = findViewById(R.id.b5)
        val b6: ImageView = findViewById(R.id.b6)
        val b7: ImageView = findViewById(R.id.b7)
        val b8: ImageView = findViewById(R.id.b8)
        val b9: ImageView = findViewById(R.id.b9)

        val t1: TextView = findViewById(R.id.t1)
        val t2: TextView = findViewById(R.id.t2)
        val t3: TextView = findViewById(R.id.t3)
        val tc12: TextView = findViewById(R.id.tc12)
        val tc22: TextView = findViewById(R.id.tc22)

        var countStep = 0

        var winPlayer1 = 0
        var winPlayer2 = 0
        tc12.text = getString(R.string.victories, winPlayer1)
        tc22.text = getString(R.string.victories, winPlayer2)

        fun chPlayer() {
            if (xOr0 == 2.0f){         //X - 1, 0 - 2
                xOr0 = 1.0f
                t1.text = getString(R.string.t4)
            } else {
                xOr0 = 2.0f
                t1.text = getString(R.string.t5)
            }
        }

        fun winner() {
            t2.visibility = View.VISIBLE
            val winner = if (xOr0 == 1.0f) getString(R.string.player1)
            else getString(R.string.player2)

            t2.text = getString(R.string.t6, winner)


            if (xOr0 == 1.0f) winPlayer1++
            else winPlayer2++
            tc12.text = getString(R.string.victories, winPlayer1)
            tc22.text = getString(R.string.victories, winPlayer2)

            t1.visibility = View.INVISIBLE
            t3.visibility = View.VISIBLE
            b1.setEnabled(false)
            b2.setEnabled(false)
            b3.setEnabled(false)
            b4.setEnabled(false)
            b5.setEnabled(false)
            b6.setEnabled(false)
            b7.setEnabled(false)
            b8.setEnabled(false)
            b9.setEnabled(false)

            t3.setOnClickListener{      // button - try again
                b1.translationZ = 0.0f
                b2.translationZ = 0.0f
                b3.translationZ = 0.0f
                b4.translationZ = 0.0f
                b5.translationZ = 0.0f
                b6.translationZ = 0.0f
                b7.translationZ = 0.0f
                b8.translationZ = 0.0f
                b9.translationZ = 0.0f

                b1.background = getDrawable(R.mipmap.grass_foreground)
                b2.background = getDrawable(R.mipmap.grass_foreground)
                b3.background = getDrawable(R.mipmap.grass_foreground)
                b4.background = getDrawable(R.mipmap.grass_foreground)
                b5.background = getDrawable(R.mipmap.grass_foreground)
                b6.background = getDrawable(R.mipmap.grass_foreground)
                b7.background = getDrawable(R.mipmap.grass_foreground)
                b8.background = getDrawable(R.mipmap.grass_foreground)
                b9.background = getDrawable(R.mipmap.grass_foreground)



                xOr0 = 2.0f                          //  for Player 1 starts the game (X)
                t1.visibility = View.VISIBLE
                t2.visibility = View.INVISIBLE
                t1.text = getString(R.string.t1)

                b1.setEnabled(true)
                b2.setEnabled(true)
                b3.setEnabled(true)
                b4.setEnabled(true)
                b5.setEnabled(true)
                b6.setEnabled(true)
                b7.setEnabled(true)
                b8.setEnabled(true)
                b9.setEnabled(true)

                t3.visibility = View.INVISIBLE

                countStep = 0
            }

        }

        fun valueDraw() {
            countStep++
            if (countStep == 9 && t2.visibility == View.INVISIBLE) {
                t2.visibility = View.VISIBLE
                t2.text = getString(R.string.valueDraw)

                t1.visibility = View.INVISIBLE
                t3.visibility = View.VISIBLE
                b1.setEnabled(false)            //lock buttons
                b2.setEnabled(false)
                b3.setEnabled(false)
                b4.setEnabled(false)
                b5.setEnabled(false)
                b6.setEnabled(false)
                b7.setEnabled(false)
                b8.setEnabled(false)
                b9.setEnabled(false)

                t3.setOnClickListener {      // button - try again
                    b1.translationZ = 0.0f
                    b2.translationZ = 0.0f
                    b3.translationZ = 0.0f
                    b4.translationZ = 0.0f
                    b5.translationZ = 0.0f
                    b6.translationZ = 0.0f
                    b7.translationZ = 0.0f
                    b8.translationZ = 0.0f
                    b9.translationZ = 0.0f

                    b1.background = getDrawable(R.mipmap.grass_foreground)
                    b2.background = getDrawable(R.mipmap.grass_foreground)
                    b3.background = getDrawable(R.mipmap.grass_foreground)
                    b4.background = getDrawable(R.mipmap.grass_foreground)
                    b5.background = getDrawable(R.mipmap.grass_foreground)
                    b6.background = getDrawable(R.mipmap.grass_foreground)
                    b7.background = getDrawable(R.mipmap.grass_foreground)
                    b8.background = getDrawable(R.mipmap.grass_foreground)
                    b9.background = getDrawable(R.mipmap.grass_foreground)

                    xOr0 = 2.0f                          //  for Player 1 starts the game (X)
                    t1.visibility = View.VISIBLE
                    t2.visibility = View.INVISIBLE
                    t1.text = getString(R.string.t1)

                    b1.setEnabled(true)
                    b2.setEnabled(true)
                    b3.setEnabled(true)
                    b4.setEnabled(true)
                    b5.setEnabled(true)
                    b6.setEnabled(true)
                    b7.setEnabled(true)
                    b8.setEnabled(true)
                    b9.setEnabled(true)

                    t3.visibility = View.INVISIBLE

                    countStep = 0
                }
            }
        }


        b1.setOnClickListener {
            if (b1.translationZ == emptyPlace) {        //if place is empty - allow move
                chPlayer()
                b1.translationZ = xOr0

                if (xOr0 == 2.0f) b1.background = getDrawable(R.mipmap.tank_foreground)
                else b1.background = getDrawable(R.mipmap.eg)

                if (
                    b1.translationZ == b2.translationZ && b1.translationZ == b3.translationZ ||
                    b1.translationZ == b4.translationZ && b1.translationZ == b7.translationZ ||
                    b1.translationZ == b5.translationZ && b1.translationZ == b9.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b2.setOnClickListener {
            if (b2.translationZ == emptyPlace) {
                chPlayer()
                b2.translationZ = xOr0

                if (b2.translationZ == 2.0f) b2.background = getDrawable(R.mipmap.tank_foreground)
                else b2.background = getDrawable(R.mipmap.eg)

                if (
                    b2.translationZ == b3.translationZ && b2.translationZ == b1.translationZ ||
                    b2.translationZ == b5.translationZ && b2.translationZ == b8.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b3.setOnClickListener {
            if (b3.translationZ == emptyPlace) {
                chPlayer()

                b3.translationZ = xOr0

                if (b3.translationZ == 2.0f) b3.background = getDrawable(R.mipmap.tank_foreground)
                else b3.background = getDrawable(R.mipmap.eg)

                if (
                    b3.translationZ == b2.translationZ && b3.translationZ == b1.translationZ ||
                    b3.translationZ == b6.translationZ && b3.translationZ == b9.translationZ ||
                    b3.translationZ == b5.translationZ && b3.translationZ == b7.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b4.setOnClickListener {
            if (b4.translationZ == emptyPlace) {
                chPlayer()
                b4.translationZ = xOr0

                if (b4.translationZ == 2.0f) b4.background = getDrawable(R.mipmap.tank_foreground)
                else b4.background = getDrawable(R.mipmap.eg)

                if (
                    b4.translationZ == b5.translationZ && b4.translationZ == b6.translationZ ||
                    b4.translationZ == b1.translationZ && b4.translationZ == b7.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b5.setOnClickListener {
            if (b5.translationZ == emptyPlace) {
                chPlayer()
                b5.translationZ = xOr0

                if (b5.translationZ == 2.0f) b5.background = getDrawable(R.mipmap.tank_foreground)
                else b5.background = getDrawable(R.mipmap.eg)

                if (
                    b5.translationZ == b4.translationZ && b5.translationZ == b6.translationZ ||
                    b5.translationZ == b2.translationZ && b5.translationZ == b8.translationZ ||
                    b5.translationZ == b1.translationZ && b5.translationZ == b9.translationZ ||
                    b5.translationZ == b7.translationZ && b5.translationZ == b3.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b6.setOnClickListener {
            if (b6.translationZ == emptyPlace) {
                chPlayer()
                b6.translationZ = xOr0

                if (b6.translationZ == 2.0f) b6.background = getDrawable(R.mipmap.tank_foreground)
                else b6.background = getDrawable(R.mipmap.eg)

                if (
                    b6.translationZ == b5.translationZ && b6.translationZ == b4.translationZ ||
                    b6.translationZ == b3.translationZ && b6.translationZ == b9.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b7.setOnClickListener {
            if (b7.translationZ == emptyPlace) {
                chPlayer()
                b7.translationZ = xOr0

                if (b7.translationZ == 2.0f) b7.background = getDrawable(R.mipmap.tank_foreground)
                else b7.background = getDrawable(R.mipmap.eg)

                if (
                    b7.translationZ == b4.translationZ && b7.translationZ == b1.translationZ ||
                    b7.translationZ == b8.translationZ && b7.translationZ == b9.translationZ ||
                    b7.translationZ == b5.translationZ && b7.translationZ == b3.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b8.setOnClickListener {
            if (b8.translationZ == emptyPlace) {
                chPlayer()
                b8.translationZ = xOr0

                if (b8.translationZ == 2.0f) b8.background = getDrawable(R.mipmap.tank_foreground)
                else b8.background = getDrawable(R.mipmap.eg)

                if (b8.translationZ == b7.translationZ && b8.translationZ == b9.translationZ ||
                    b8.translationZ == b5.translationZ && b8.translationZ == b2.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
        b9.setOnClickListener {
            if (b9.translationZ == emptyPlace) {
                chPlayer()
                b9.translationZ = xOr0

                if (b9.translationZ == 2.0f) b9.background = getDrawable(R.mipmap.tank_foreground)
                else b9.background = getDrawable(R.mipmap.eg)

                if (
                    b9.translationZ == b8.translationZ && b9.translationZ == b7.translationZ ||
                    b9.translationZ == b6.translationZ && b9.translationZ == b3.translationZ ||
                    b9.translationZ == b5.translationZ && b9.translationZ == b1.translationZ
                ) {
                    winner()
                }
                valueDraw()
            }
        }
    }
}
