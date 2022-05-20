package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView

@Suppress("UsePropertyAccessSyntax", "RemoveExplicitTypeArguments")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "CutPasteId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttons = arrayOf(
            findViewById<Button>(R.id.button1),
            findViewById<Button>(R.id.button2),
            findViewById<Button>(R.id.button3),
            findViewById<Button>(R.id.button4),
            findViewById<Button>(R.id.button5),
            findViewById<Button>(R.id.button6),
            findViewById<Button>(R.id.button7),
            findViewById<Button>(R.id.button8),
            findViewById<Button>(R.id.button9)

        )
        val currPlayer = findViewById<TextView>(R.id.playerTextView)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {

            when {
                currPlayer.text.contains("X") -> {
                    button1.setText("X")
                    button1.isClickable = false
                    changePlayer()
                }
                currPlayer.text.contains("O") -> {
                    button1.setText("O")
                    button1.isClickable = false
                    changePlayer()
                }
            }
            ifWon(buttons)
            tie(buttons)

        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {

            when {
                currPlayer.text.contains("X") -> {
                    button2.setText("X")
                    button2.isClickable = false
                    changePlayer()
                }
                currPlayer.text.contains("O") -> {
                    button2.setText("O")
                    button2.isClickable = false
                    changePlayer()
                }
            }
            ifWon(buttons)
            tie(buttons)
        }
        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            when {
                currPlayer.text.contains("X") -> {
                    button3.setText("X")
                    button3.isClickable = false
                    changePlayer()
                }
                currPlayer.text.contains("O") -> {
                    button3.setText("O")
                    button3.isClickable = false
                    changePlayer()
                }
            }
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
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
            ifWon(buttons)
            tie(buttons)
        }

        val newGame = findViewById<Button>(R.id.buttonNewGame)
        newGame.setOnClickListener {
            currPlayer.setText("Player Xs Turn")
            enableButtons(buttons)
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
    fun disableButtons(buttons: Array<Button>) {

        for (button in buttons) {
            button.isClickable = false

        }
    }
    fun enableButtons(buttons: Array<Button>) {

        for (b in buttons) {
            b.isClickable = true
            b.setText("")
        }
    }

    @SuppressLint("SetTextI18n")
    fun ifWon(buttons: Array<Button>): Boolean {

        val button1Text = findViewById<Button>(R.id.button1).text.toString()
        val button2Text = findViewById<Button>(R.id.button2).text.toString()
        val button3Text = findViewById<Button>(R.id.button3).text.toString()
        val button4Text = findViewById<Button>(R.id.button4).text.toString()
        val button5Text = findViewById<Button>(R.id.button5).text.toString()
        val button6Text = findViewById<Button>(R.id.button6).text.toString()
        val button7Text = findViewById<Button>(R.id.button7).text.toString()
        val button8Text = findViewById<Button>(R.id.button8).text.toString()
        val button9Text = findViewById<Button>(R.id.button9).text.toString()


        val currPlayer = findViewById<TextView>(R.id.playerTextView)

        if(button1Text == button2Text && button2Text == button3Text && button1Text != "") {
            currPlayer.setText("Player $button1Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button4Text == button5Text && button5Text == button6Text && button4Text != "") {
            currPlayer.setText("Player $button5Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button7Text == button8Text && button8Text == button9Text && button7Text != "") {
            currPlayer.setText("Player $button7Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button1Text == button4Text && button4Text == button7Text && button1Text != "") {
            currPlayer.setText("Player $button1Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button2Text == button5Text && button5Text == button8Text && button2Text != "") {
            currPlayer.setText("Player $button2Text wins!")
            return true
        }
        if(button3Text == button6Text && button6Text == button9Text && button3Text != "") {
            currPlayer.setText("Player $button3Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button1Text == button5Text && button5Text == button9Text && button1Text != "") {
            currPlayer.setText("Player $button1Text wins!")
            disableButtons(buttons)
            return true
        }
        if(button3Text == button5Text && button5Text == button7Text && button3Text != "") {
            currPlayer.setText("Player $button3Text wins!")
            disableButtons(buttons)
            return true
        }
        return false
    }

    @SuppressLint("SetTextI18n")
    fun tie(buttons : Array<Button>) {
        val currPlayer = findViewById<TextView>(R.id.playerTextView)
        val button1Text = findViewById<Button>(R.id.button1).text.toString()
        val button2Text = findViewById<Button>(R.id.button2).text.toString()
        val button3Text = findViewById<Button>(R.id.button3).text.toString()
        val button4Text = findViewById<Button>(R.id.button4).text.toString()
        val button5Text = findViewById<Button>(R.id.button5).text.toString()
        val button6Text = findViewById<Button>(R.id.button6).text.toString()
        val button7Text = findViewById<Button>(R.id.button7).text.toString()
        val button8Text = findViewById<Button>(R.id.button8).text.toString()
        val button9Text = findViewById<Button>(R.id.button9).text.toString()
        if(button1Text != "" && button2Text != "" && button3Text != "" && button4Text != ""
            && button5Text != "" && button6Text != "" && button7Text != "" && button8Text != "" && button9Text != "") {

                if(ifWon(buttons) == false) {
                    currPlayer.setText("Its a Tie :(")
                    disableButtons(buttons)
                }

        }
    }






















}