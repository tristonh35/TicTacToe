package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

@Suppress("UsePropertyAccessSyntax")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currPlayer = findViewById<TextView>(R.id.playerTextView)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button1.setText("X")
                button1.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button1.setText("O")
                button1.isClickable = false
                changePlayer()
            }
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button2.setText("X")
                button2.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button2.setText("O")
                button2.isClickable = false
                changePlayer()
            }
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button3.setText("X")
                button3.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button3.setText("O")
                button3.isClickable = false
                changePlayer()
            }
        }
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button4.setText("X")
                button4.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button4.setText("O")
                button4.isClickable = false
                changePlayer()
            }
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button5.setText("X")
                button5.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button5.setText("O")
                button5.isClickable = false
                changePlayer()
            }
        }
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button6.setText("X")
                button6.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button6.setText("O")
                button6.isClickable = false
                changePlayer()
            }
        }
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button7.setText("X")
                button7.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button7.setText("O")
                button7.isClickable = false
                changePlayer()
            }
        }
        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button8.setText("X")
                button8.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button8.setText("O")
                button8.isClickable = false
                changePlayer()
            }
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            if(currPlayer.text.contains("X")) {
                button9.setText("X")
                button9.isClickable = false
                changePlayer()
            }
            else if (currPlayer.text.contains("O")) {
                button9.setText("O")
                button9.isClickable = false
                changePlayer()
            }
        }
        val newGame = findViewById<Button>(R.id.buttonNewGame)
        newGame.setOnClickListener {
            currPlayer.setText("Player Xs Turn")
            button1.isClickable = true
            button2.isClickable = true
            button3.isClickable = true
            button4.isClickable = true
            button5.isClickable = true
            button6.isClickable = true
            button7.isClickable = true
            button8.isClickable = true
            button9.isClickable = true
            button1.setText("")
            button2.setText("")
            button3.setText("")
            button4.setText("")
            button5.setText("")
            button6.setText("")
            button7.setText("")
            button8.setText("")
            button9.setText("")
        }


    }




    @SuppressLint("SetTextI18n")
    fun changePlayer() {
       val currPlayer = findViewById<TextView>(R.id.playerTextView)
        if(currPlayer.text.contains("X")) {
            currPlayer.setText("Player Os Turn")
        }
        else if(currPlayer.text.contains("O")) {
            currPlayer.setText("Player Xs Turn")
        }
    }





}