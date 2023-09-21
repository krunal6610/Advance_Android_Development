package com.example.rotateimageanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var myImg:ImageView
    lateinit var btnClockwise:Button
    lateinit var btnAntiClockwise:Button
    lateinit var blinkAnimation:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myImg = findViewById(R.id.myImg)
        btnClockwise = findViewById(R.id.btnClockwise)
        btnAntiClockwise = findViewById(R.id.btnAntiClockwise)
        blinkAnimation = findViewById(R.id.blinkAnimation)




        btnClockwise.setOnClickListener {

            var clockAnim = AnimationUtils.loadAnimation(this,R.anim.clockwise_animation)
           myImg.startAnimation(clockAnim)

        // myImg.animation = clockAnim
           // clockAnim.start()


        }

        btnAntiClockwise.setOnClickListener {

            var anticlockAnim = AnimationUtils.loadAnimation(this,R.anim.anticlockwise_animation)
            myImg.startAnimation(anticlockAnim)

          //  myImg.animation = anticlockAnim
           // anticlockAnim.start()

        }

        blinkAnimation.setOnClickListener {

            var blinkAnim = AnimationUtils.loadAnimation(this,R.anim.blink_animation)
            myImg.startAnimation(blinkAnim)

          //  myImg.animation = anticlockAnim
           // anticlockAnim.start()

        }

    }




}