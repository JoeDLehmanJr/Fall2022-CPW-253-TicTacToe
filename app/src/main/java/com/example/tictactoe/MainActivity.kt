package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tictactoe.R.id.*

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

    private var inGame: Boolean = false
    private var playerX: Boolean = true
    private var playerXChoices = ArrayList<Int>()
    private var playerOChoices = ArrayList<Int>()

    private var lost = false
    private var boxes: ArrayList<Button> = arrayListOf()
    private var turnText: ArrayList<TextView> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // project buttons to create a 3 x 3 grid and new game
        boxes = arrayListOf(
            findViewById(button1), // index 0 topLeft #1 r1c1
            findViewById(button2), // index 1 topMiddle #2 r1c2
            findViewById(button3), // index 2 topRight #3 r1c3
            findViewById(button4), // index 3 centerLeft #4 r2c1
            findViewById(button5), // index 4 boxes[4] #5 r2c2
            findViewById(button6), // index 5 boxes[5] #6 r2c3
            findViewById(button7), // index 6 boxes[6] #7 r3c1
            findViewById(button8), // index 7 boxes[7] #8 r3c2
            findViewById(button9), // index 8 boxes[8] #8 r3c3
            findViewById(button10) // New game
        )
        // project textview to display who's turn is it
        turnText = arrayListOf(findViewById(textView))

        boxes[0].setOnClickListener() {
            if (boxes[0].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[0].text = "X"
                    boxes[0].isClickable = false
                    setButtonsText(1, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[0].text = "O"
                    boxes[0].isClickable = false
                    setButtonsText(1, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[1].setOnClickListener {
            if (boxes[1].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[1].text = "X"
                    boxes[1].isClickable = false
                    setButtonsText(2, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[1].text = "O"
                    boxes[1].isClickable = false
                    setButtonsText(2, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[2].setOnClickListener {
            if (boxes[2].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[2].text = "X"
                    boxes[2].isClickable = false
                    setButtonsText(3, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[2].text = "O"
                    boxes[2].isClickable = false
                    setButtonsText(3, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[3].setOnClickListener {
            if (boxes[3].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[3].text = "X"
                    boxes[3].isClickable = false
                    setButtonsText(4, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[3].text = "O"
                    boxes[3].isClickable = false
                    setButtonsText(4, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[4].setOnClickListener {
            if (boxes[4].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[4].text = "X"
                    boxes[4].isClickable = false
                    setButtonsText(5, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[4].text = "O"
                    boxes[4].isClickable = false
                    setButtonsText(5, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[5].setOnClickListener {
            if (boxes[5].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[5].text = "X"
                    boxes[5].isClickable = false
                    setButtonsText(6, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[5].text = "O"
                    boxes[5].isClickable = false
                    setButtonsText(6, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[6].setOnClickListener {
            if (boxes[6].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[6].text = "X"
                    boxes[6].isClickable = false
                    setButtonsText(7, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[6].text = "O"
                    boxes[6].isClickable = false
                    setButtonsText(7, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[7].setOnClickListener {
            if (boxes[7].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[7].text = "X"
                    boxes[7].isClickable = false
                    setButtonsText(8, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[7].text = "O"
                    boxes[7].isClickable = false
                    setButtonsText(8, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }

        boxes[8].setOnClickListener {
            if (boxes[8].text == " ") {
                inGame = true
                if (playerX) {
                    boxes[8].text = "X"
                    boxes[8].isClickable = false
                    setButtonsText(9, "X")
                    if (checkForWin()) {
                        endGame("Player X won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = false
                    turnText[0].text = "Player O's Turn"
                } else {
                    boxes[8].text = "O"
                    boxes[8].isClickable = false
                    setButtonsText(9, "O")
                    if (checkForWin()) {
                        endGame("Player O won!")
                        return@setOnClickListener
                    } else if (!checkForWin() && lost) {
                        endGame("Draw!")
                        return@setOnClickListener
                    }
                    playerX = true
                    turnText[0].text = "Player X's Turn"
                }
            }
        }


        boxes[9].setOnClickListener() {
            // row 1
            boxes[0].isClickable = true
            boxes[0].text = " "
            boxes[1].isClickable = true
            boxes[1].text = " "
            boxes[2].isClickable = true
            boxes[2].text = " "

            // row 2
            boxes[3].isClickable = true
            boxes[3].text = " "
            boxes[4].isClickable = true
            boxes[4].text = " "
            boxes[5].isClickable = true
            boxes[5].text = " "

            // row 3
            boxes[6].isClickable = true
            boxes[6].text = " "
            boxes[7].isClickable = true
            boxes[7].text = " "
            boxes[8].isClickable = true
            boxes[8].text = " "

            turnText[0].text = "Player X's Turn"
            playerX = true
            lost = false
        }
    }


    private fun endGame(values: String) {

        // button1
        boxes[0].isClickable  = false

        // button2
        boxes[1].isClickable  = false

        // button3
        boxes[2].isClickable  = false

        // button4
        boxes[3].isClickable  = false

        //button5
        boxes[4].isClickable  = false

        // button6
        boxes[5].isClickable  = false

        // button7
        boxes[6].isClickable  = false

        // button8
        boxes[7].isClickable  = false

        // button9
        boxes[8].isClickable  = false

        turnText[0].text = values
        inGame = false
        playerXChoices.clear()
        playerOChoices.clear()
    }


    private fun setButtonsText( index:Int, str:String ) {
        if (playerX) {
            if ( (index >= 1) && (index <= 9) ) {
                boxes[index - 1].text = str
                playerXChoices.add( index )
            }
        } else {
            if ( (index >= 0) && (index <= 9) ) {
                boxes[index - 1].text = str
                playerOChoices.add( index )
            }
        }
    }

    private fun checkForWin():Boolean {
        if (
                (( playerXChoices.contains(1) && playerXChoices.contains(2) && playerXChoices.contains(3) ) // Top row
                    || ( playerXChoices.contains(4) && playerXChoices.contains(5) && playerXChoices.contains(6) ) // Middle row
                    || ( playerXChoices.contains(7) && playerXChoices.contains(8) && playerXChoices.contains(9) ) // Bottom row
                    || ( playerXChoices.contains(1) && playerXChoices.contains(4) && playerXChoices.contains(7) ) // Left most column
                    || ( playerXChoices.contains(2) && playerXChoices.contains(5) && playerXChoices.contains(8) ) // Middle column
                    || ( playerXChoices.contains(3) && playerXChoices.contains(6) && playerXChoices.contains(9) ) // Right most column
                    || ( playerXChoices.contains(3) && playerXChoices.contains(5) && playerXChoices.contains(7) ) // Reverse diagonal
                    || ( playerXChoices.contains(1) && playerXChoices.contains(5) && playerXChoices.contains(9) ) && playerX ) // Forward diagonal
        ) {
            return true
        }
        if (
            (( playerOChoices.contains(1) && playerOChoices.contains(2) && playerOChoices.contains(3) ) // Top row
                    || ( playerOChoices.contains(4) && playerOChoices.contains(5) && playerOChoices.contains(6) ) // Middle row
                    || ( playerOChoices.contains(7) && playerOChoices.contains(8) && playerOChoices.contains(9) ) // Bottom row
                    || ( playerOChoices.contains(1) && playerOChoices.contains(4) && playerOChoices.contains(7) ) // Left most column
                    || ( playerOChoices.contains(2) && playerOChoices.contains(5) && playerOChoices.contains(8) ) // Middle column
                    || ( playerOChoices.contains(3) && playerOChoices.contains(6) && playerOChoices.contains(9) ) // Right most column
                    || ( playerOChoices.contains(3) && playerOChoices.contains(5) && playerOChoices.contains(7) ) // Reverse diagonal
                    || ( playerOChoices.contains(1) && playerOChoices.contains(5) && playerOChoices.contains(9) ) && !playerX ) // Forward diagonal
        ) {
            return true
        }
        if ( playerXChoices.size == 4 && playerOChoices.size == 4) {
            lost = true
        }
        return false
    }
}





