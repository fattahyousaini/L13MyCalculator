package com.myapplicationdev.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var msg = ""

    var plusNum = 0.0
    var minusNum = 0.0
    var timesNum = 0.0
    var divideNum = 0.0

    var plusBoolean = false
    var minusBoolean = false
    var timesBoolean = false
    var divideBoolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAC.setOnClickListener {
            tvNum.text = 0.toString()
            msg = ""
        }

        btnPlus.setOnClickListener {
            plusNum = tvNum.text.toString().toDouble()
            plusBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnMinus.setOnClickListener {
            minusNum = tvNum.text.toString().toDouble()
            minusBoolean = true
            msg = ""
            tvNum.text = ""
        }

        btnTimes.setOnClickListener {
            timesNum = tvNum.text.toString().toDouble()
            timesBoolean = true
            msg = ""
            tvNum.text = ""
        }

        btnDivide.setOnClickListener {
            divideNum = tvNum.text.toString().toDouble()
            divideBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnEqual.setOnClickListener {
            if (plusBoolean){
                var plusResult = plusNum + tvNum.text.toString().toDouble()
                tvNum.text = plusResult.toString()
                plusBoolean = false
            }
            else if (minusBoolean){
                var minusResult = minusNum - tvNum.text.toString().toDouble()
                tvNum.text = minusResult.toString()
                minusBoolean = false
            }
            else if (timesBoolean) {
                var multiplyResult = timesNum * tvNum.text.toString().toDouble()
                tvNum.text = multiplyResult.toString()
                timesBoolean = false
            }
            else if (divideBoolean) {
                var divideResult = divideNum / tvNum.text.toString().toDouble()
                tvNum.text = divideResult.toString()
                divideBoolean = false
            }
        }

    }
    fun btnOnClick(view: View){
        val btnSelected = view as Button
        when(btnSelected.id){
            btn0.id -> msg += "0"
            btn1.id -> msg += "1"
            btn2.id -> msg += "2"
            btn3.id -> msg += "3"
            btn4.id -> msg += "4"
            btn5.id -> msg += "5"
            btn6.id -> msg += "6"
            btn7.id -> msg += "7"
            btn8.id -> msg += "8"
            btn9.id -> msg += "9"
            btnDot.id -> msg += "."
        }
        tvNum.text = msg
    }
}