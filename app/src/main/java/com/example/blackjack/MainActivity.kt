package com.example.blackjack

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var count = 0
    private var cardAce = 25
    private var cardTwo = 25
    private var cardThree = 25
    private var cardFour = 25
    private var cardFive = 25
    private var cardSix = 25
    private var cardSeven = 25
    private var cardEight = 25
    private var cardNine = 25
    private var cardTen = 25
    private var cardJack = 25
    private var cardQueen = 25
    private var cardKing = 25
    private var all = 0
    private var mid = 0
    private var low = 0
    private var high = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.two)
        val button2 = findViewById<Button>(R.id.three)
        val button3 = findViewById<Button>(R.id.four)
        val button4 = findViewById<Button>(R.id.five)
        val button5 = findViewById<Button>(R.id.six)
        val button6 = findViewById<Button>(R.id.seven)
        val button7 = findViewById<Button>(R.id.eight)
        val button8 = findViewById<Button>(R.id.nine)
        val button12 = findViewById<Button>(R.id.ten)
        val button11 = findViewById<Button>(R.id.Jack)
        val button10 = findViewById<Button>(R.id.Queen)
        val button9 = findViewById<Button>(R.id.King)
        val button13 = findViewById<Button>(R.id.Ace)
        //val resultsTextView = findViewById<textView>(R.id.resultstextview)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button10.setOnClickListener(this)
        button11.setOnClickListener(this)
        button12.setOnClickListener(this)
        button13.setOnClickListener(this)
    }



    override fun onClick(v: View?) {

        //Switches the behavior based on which button invoked the onClick function
        when (v?.id) {
            //Can call either a function
            R.id.two -> two()
            //Or code can be executed here directly
            R.id.three -> three()

            R.id.four -> four()

            R.id.five -> five()

            R.id.six -> six()

            // the next line if for neutral

            R.id.seven -> seven()

            R.id.eight -> eight()

            R.id.nine -> nine()

            // the next line is for minus
            R.id.ten -> ten()

            R.id.Jack -> jack()

            R.id.Queen -> queen()

            R.id.King -> king()

            R.id.Ace -> ace()
        }
    }

    private fun ace() {
        cardAce -= 1
       // textView.text = cardAce.toString()
          allCards()
    }
    private fun two() {
        cardTwo -= 1
        //textView.text = cardFive.toString()
          allCards()
    }
    private fun three() {
        cardThree -= 1
        //textView.text = cardFive.toString()
        //  allCards()
    }
    private fun four() {
        cardFour -= 1
        //textView.text = cardFive.toString()
         allCards()
    }
    private fun five() {
        cardFive -= 1
        //textView.text = cardFive.toString()
         allCards()
    }

    private fun six() {
        cardSix -= 1
        textView.text = cardFive.toString()
        // allCards()
    }

    private fun seven() {
        cardSeven -= 1
        //textView.text = cardFive.toString()
        //allCards()
    }
    private fun eight() {
        cardEight -= 1
        //textView.text = cardFive.toString()
         allCards()
    }
    private fun nine() {
        cardNine -= 1
        //textView.text = cardFive.toString()
        allCards()
    }
    private fun ten() {
        cardTen -= 1
        //textView.text = cardFive.toString()
        allCards()
    }
    private fun jack() {
        cardJack -= 1
        //textView.text = cardFive.toString()
          allCards()
    }
    private fun queen() {
        cardQueen -= 1
        //textView.text = cardFive.toString()
         allCards()
    }
    private fun king() {
        cardKing -= 1
        //plus()
         allCards()
         //textView.text = all.toString()
    }

    private fun allCards() {
        all = cardTwo + cardThree + cardFour + cardFive + cardSix + cardSix + cardSeven + cardEight + cardNine + cardTen + cardJack + cardQueen + cardKing + cardAce
        low = cardTwo + cardThree + cardFour + cardFive + cardSix
         mid = cardSeven + cardEight + cardNine
        high = cardTen + cardJack + cardQueen + cardKing + cardAce
        textView.text = mid.toString()
    }

   /* private fun plus() {
        Log.d("TAG", "Button 1 was clicked")
        count += 1
        resultstextview.text = count.toString()
        five()
    }*/

}


