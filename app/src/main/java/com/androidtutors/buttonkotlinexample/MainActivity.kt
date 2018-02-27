package com.androidtutors.buttonkotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 18 : Set string constant revertString to textview_hello's text

        //TODO 19 : Add setOnClickListener on button_revert and set textview_hello to revertString


    }

    //TODO 16 : Create a method changeTextOnClick with no return value
    //TODO 17 : Change the text of textview_hello to "Learning Kotlin" inside the method
    fun changeTextOnClick(v: View){
        textview_hello.text = "Learning Kotlin"
    }


}
