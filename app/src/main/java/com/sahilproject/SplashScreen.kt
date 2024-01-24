package com.sahilproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.ScaleAnimation
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.sahilproject.databinding.SplashscreeenBinding


fun scaleView(v: View, startScale: Float, endScale: Float) {
    val anim: Animation = ScaleAnimation(
        1f, 1f,  // Start and end values for the X axis scaling
        startScale, endScale,  // Start and end values for the Y axis scaling
        Animation.RELATIVE_TO_SELF, 0f,  // Pivot point of X scaling
        Animation.RELATIVE_TO_SELF, 1f
    ) // Pivot point of Y scaling
    anim.fillAfter = true // Needed to keep the result of the animation
    anim.duration = 1000
    v.startAnimation(anim)
}



class SplashScreen : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: SplashscreeenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SplashscreeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

      /*  val scaleanim: Animation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.scaledown)

        scaleView(binding.myimageid,1.0f,0.0f)*/

        Handler().postDelayed(
          Runnable {
              val intent = Intent(this, SahilActivity::class.java)
              startActivity(intent)
          }  ,3000
        );





    }



}





