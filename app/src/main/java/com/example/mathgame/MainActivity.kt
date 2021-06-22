package com.example.mathgame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var num1 = 0
    var num2 = 0
    var amal = 0
    var javob = 0
    var user_input_answer = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random()

        check.setOnClickListener {

            if (user_answer.text.toString().isEmpty()) {
                user_answer.hint = "Enter"
            } else {
                user_input_answer = user_answer.text.toString().toInt()
                if (user_input_answer == javob) {
                    Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show()
                    random()
                    user_answer.text.clear()
                } else {
                    Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
                    random()
                    user_answer.text.clear()
                }
            }
        }

    }fun random(){
        num1 = java.util.Random().nextInt(20)
        num2 = java.util.Random().nextInt(20)
        amal = java.util.Random().nextInt(4)
        ekranYoz()
    }fun ekranYoz(){
        when(amal){
            0->{
                javob = num1+num2
                quize.text = "$num1 + $num2"
            }1->{
            javob = num1-num2
            quize.text = "$num1 - $num2"
            }2->{
            javob = num1*num2
            quize.text = "$num1 * $num2"
            }3->{
                try {
                    if (num1%num2==0){
                        javob = num1/num2
                        quize.text = "$num1 / $num2"
                    }else{
                        random()
                    }
                }catch (e:Exception){
                    random()
                }
            }
        }
    }
}