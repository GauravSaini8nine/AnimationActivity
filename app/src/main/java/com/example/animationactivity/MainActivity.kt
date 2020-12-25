package com.example.animationactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        declaring animation
        val toptobottom = AnimationUtils.loadAnimation(this, R.anim.toptobottom)
        val scaletobig = AnimationUtils.loadAnimation(this, R.anim.scaletobig)
        val righttoleft = AnimationUtils.loadAnimation(this, R.anim.righttoleft)
        val button_one = AnimationUtils.loadAnimation(this, R.anim.buttom1)
        val button_two = AnimationUtils.loadAnimation(this, R.anim.buttom2)
        val button_three = AnimationUtils.loadAnimation(this, R.anim.buttom3)
        val button_four_LtoR = AnimationUtils.loadAnimation(this, R.anim.buttom4_l_to_r)
        val button_five_RtoL = AnimationUtils.loadAnimation(this, R.anim.buttom5_r_to_l)


//        id's
        val title = findViewById<TextView>(R.id.title_header)
        val subtitle = findViewById<TextView>(R.id.sub_title)
        val author = findViewById<TextView>(R.id.author)
        val image = findViewById<ImageView>(R.id.main_image)
        val button1 = findViewById<CardView>(R.id.button_one)
        val button2 = findViewById<CardView>(R.id.button_two)
        val button3 = findViewById<CardView>(R.id.button_three)
        val button4_LtoR = findViewById<Button>(R.id.button_previous)
        val button5_RtoL = findViewById<Button>(R.id.button_next)

//      set Animation
        title.startAnimation(toptobottom)
        subtitle.startAnimation(toptobottom)
        author.startAnimation(righttoleft)
        image.startAnimation(scaletobig)
        button1.startAnimation(button_one)
        button2.startAnimation(button_two)
        button3.startAnimation(button_three)
        button4_LtoR.startAnimation(button_four_LtoR)
        button5_RtoL.startAnimation(button_five_RtoL)

    }
}