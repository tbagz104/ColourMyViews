package com.example.colourmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableBoxes :List<View> = listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,constraint_layout,button_one,button_two,
            button_three,button_four)

        for (i in clickableBoxes){
            i.setOnClickListener { makeColoured(it)}
        }
    }

    private fun makeColoured(view: View) {
        when (view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)


            //Boxes using colors from colors.xml
            R.id.button_one -> box_three_text.setBackgroundResource(R.color.my_colour1)
            R.id.button_two -> box_two_text.setBackgroundResource(R.color.my_colour2)
            R.id.button_three -> box_one_text.setBackgroundResource(R.color.my_colour3)

            R.id.button_four -> constraint_layout.setBackgroundResource(R.color.bg_colour)

            else -> view.setBackgroundColor(Color.RED)
        }
    }

}
