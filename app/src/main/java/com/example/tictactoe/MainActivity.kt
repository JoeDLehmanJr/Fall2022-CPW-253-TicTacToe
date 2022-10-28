package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tictactoe.R.id.*

class MainActivity : AppCompatActivity() {


    private var inGame: Boolean = false
    private var playerX: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // project buttons
        val topLeft = findViewById<Button>(button1)
        val topMiddle = findViewById<Button>(button2)
        val topRight = findViewById<Button>(button3)
        val centerLeft = findViewById<Button>(button4)
        val centerMiddle = findViewById<Button>(button5)
        val centerRight = findViewById<Button>(button6)
        val bottomLeft = findViewById<Button>(button7)
        val bottomMiddle = findViewById<Button>(button8)
        val bottomRight = findViewById<Button>(button9)
        val newGame = findViewById<Button>(button10)
        val turnText = findViewById<TextView>(textView)

        topLeft.setOnClickListener() {
            if (topLeft.text == " ") {
                inGame = true
                if (playerX) {
                    topLeft.text = "X"
                    topLeft.isClickable = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    topLeft.text = "O"
                    topLeft.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        topMiddle.setOnClickListener {
            if (topMiddle.text == " ") {
                inGame = true
                if (playerX) {
                    topMiddle.text = "X"
                    topMiddle.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    topMiddle.text = "O"
                    topMiddle.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        topRight.setOnClickListener {
            if (topRight.text == " ") {
                inGame = true
                if (playerX) {
                    topRight.text = "X"
                    topRight.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    topRight.text = "O"
                    topRight.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        centerLeft.setOnClickListener {
            if (centerLeft.text == " ") {
                inGame = true
                if (playerX) {
                    centerLeft.text = "X"
                    centerLeft.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    centerLeft.text = "O"
                    centerLeft.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        centerMiddle.setOnClickListener {
            if (centerMiddle.text == " ") {
                inGame = true
                if (playerX) {
                    centerMiddle.text = "X"
                    centerMiddle.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    centerMiddle.text = "O"
                    centerMiddle.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        centerRight.setOnClickListener {
            if (centerRight.text == " ") {
                inGame = true
                if (playerX) {
                    centerRight.text = "X"
                    centerRight.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    centerRight.text = "O"
                    centerRight.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        centerRight.setOnClickListener {
            if (centerRight.text == " ") {
                inGame = true
                if (playerX) {
                    centerRight.text = "X"
                    centerRight.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    centerRight.text = "O"
                    centerRight.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        bottomLeft.setOnClickListener {
            if (bottomLeft.text == " ") {
                inGame = true
                if (playerX) {
                    bottomLeft.text = "X"
                    bottomLeft.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    bottomLeft.text = "O"
                    bottomLeft.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        bottomMiddle.setOnClickListener {
            if (bottomMiddle.text == " ") {
                inGame = true
                if (playerX) {
                    bottomMiddle.text = "X"
                    bottomMiddle.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    bottomMiddle.text = "O"
                    bottomMiddle.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        bottomRight.setOnClickListener {
            if (bottomRight.text == " ") {
                inGame = true
                if (playerX) {
                    bottomRight.text = "X"
                    bottomRight.isClickable  = false
                    playerX = false
                    turnText.text = "Player O's Turn"
                } else {
                    bottomRight.text = "O"
                    bottomRight.isClickable  = false
                    playerX = true
                    turnText.text = "Player X's Turn"
                }
            }
        }

        newGame.setOnClickListener() {
            topLeft.isClickable  = true
            topLeft.text = " "
            topMiddle.isClickable  = true
            topMiddle.text = " "
            topRight.isClickable  = true
            topRight.text = " "

            centerLeft.isClickable  = true
            centerLeft.text = " "
            centerMiddle.isClickable  = true
            centerMiddle.text = " "
            centerRight.isClickable  = true
            centerRight.text = " "

            bottomLeft.isClickable  = true
            bottomLeft.text = " "
            bottomMiddle.isClickable  = true
            bottomMiddle.text = " "
            bottomRight.isClickable  = true
            bottomRight.text = " "

            turnText.text = "Player X's Turn"
            playerX = true
        }
    }
}




