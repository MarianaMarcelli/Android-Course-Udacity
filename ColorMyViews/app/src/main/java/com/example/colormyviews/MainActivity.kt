package com.example.colormyviews

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

    private fun setListeners(){
        val clickableViews: List<View> =
            listOf(txtBoxOne, txtBoxTwo, txtBoxThree, txtBoxFour, txtBoxFive, constraint_layout, btnGreen, btnYellow, btnRed)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.txtBoxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.txtBoxTwo -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.txtBoxThree-> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.txtBoxFour -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.txtBoxFive -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.btnRed -> txtBoxThree.setBackgroundResource(R.color.my_red)
            R.id.btnYellow -> txtBoxFour.setBackgroundResource(R.color.my_yellow)
            R.id.btnGreen -> txtBoxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}