package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var resultText : EditText
    var  operandOne : Float = 0.0f
    var operandTwo : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.resutlViewText)
    }



    fun operationFunction(view : View){

        val number = resultText.text.toString()


       when(view.id){


           R.id.buttonOne -> {

               resultText.setText(number+"1")
           }
           R.id.buttonTwo -> {
               resultText.setText(number+"2")
           }

           R.id.buttonThree -> {
               resultText.setText(number+"3")
           }
           R.id.buttonFour->{

               resultText.setText(number+"4")
           }
           R.id.buttonFive->{

               resultText.setText(number+"5")
           }
           R.id.buttonSix->{

               resultText.setText(number+"6")
           }
           R.id.buttonSeven->{

               resultText.setText(number+"7")
           }
           R.id.buttonEight->{

               resultText.setText(number+"8")
           }
           R.id.buttonNine->{

               resultText.setText(number+"9")
           }
           R.id.buttonZero->{

               resultText.setText(number+"0")
           }
           R.id.buttonDecimal->{
               resultText.setText(number+".")
           }

           R.id.buttonClear->{

               resultText.setText("")
           }

           R.id.buttonPlus->{

               operandOne = resultText.text.toString().toFloat()
               resultText.setText("")
               isPlus = true
           }

           R.id.buttonMinus->{

               operandOne = resultText.text.toString().toFloat()
               resultText.setText("")
               isMinus = true
           }
           R.id.buttonDivide->{
               operandOne = resultText.text.toString().toFloat()
               resultText.setText("")
               isDivide = true
           }
           R.id.buttonEquals->{

               operandTwo = resultText.text.toString().toFloat()

               if(isPlus){
                   val result = operandOne+operandTwo

                   resultText.setText(result.toString())
                   isPlus = false
               }else if(isMinus){
                   val result = operandOne - operandTwo

                   resultText.setText(result.toString())
                   isMinus = false
               }else if(isDivide){
                   val result = operandOne/operandTwo

                   resultText.setText(result.toString())
                   isDivide = false
                   }

           }

       }

    }
}