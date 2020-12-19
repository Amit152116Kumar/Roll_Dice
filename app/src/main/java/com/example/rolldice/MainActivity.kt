package com.example.rolldice

import android.animation.Animator
import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice1.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {

            }
            override fun onAnimationEnd(animator: Animator) {
                buttonenable()
            }
            override fun onAnimationCancel(p0: Animator?) {
            }
            override fun onAnimationRepeat(p0: Animator?) {
            }
        })
        dice2.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {

            }
            override fun onAnimationEnd(animator: Animator) {
                buttonenable()
            }
            override fun onAnimationCancel(p0: Animator?) {
            }
            override fun onAnimationRepeat(p0: Animator?) {
            }
        })
        dice3.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {

            }
            override fun onAnimationEnd(animator: Animator) {
                buttonenable()
            }
            override fun onAnimationCancel(p0: Animator?) {
            }
            override fun onAnimationRepeat(p0: Animator?) {
            }
        })

        dice4.addAnimatorListener(object : Animator.AnimatorListener{
                override fun onAnimationStart(animator: Animator) {
                }
                override fun onAnimationEnd(animator: Animator) {
                    buttonenable()
                }
                override fun onAnimationCancel(p0: Animator?) {
                }
                override fun onAnimationRepeat(p0: Animator?) {
                }
            })
        dice5.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {
            }
            override fun onAnimationEnd(animator: Animator) {
                buttonenable()
            }
            override fun onAnimationCancel(p0: Animator?) {
            }
            override fun onAnimationRepeat(p0: Animator?) {
            }
        })
        dice6.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(animator: Animator) {
            }
            override fun onAnimationEnd(animator: Animator) {
                buttonenable()
            }
            override fun onAnimationCancel(p0: Animator?) {
            }
            override fun onAnimationRepeat(p0: Animator?) {
            }
        })

    }

    private fun showdice1(){
        dice1.visibility=View.VISIBLE
        dice2.visibility=View.GONE
        dice3.visibility=View.GONE
        dice4.visibility = View.GONE
        dice5.visibility=View.GONE
        dice6.visibility= View.GONE
        button.isEnabled=false
    }
    private fun showdice2(){
        dice1.visibility=View.GONE
        dice2.visibility=View.VISIBLE
        dice3.visibility=View.GONE
        dice4.visibility = View.GONE
        dice5.visibility=View.GONE
        dice6.visibility= View.GONE
        button.isEnabled=false
    }
    private fun showdice3(){
        dice1.visibility=View.GONE
        dice2.visibility=View.GONE
        dice3.visibility=View.VISIBLE
        dice4.visibility = View.GONE
        dice5.visibility=View.GONE
        dice6.visibility= View.GONE
        button.isEnabled=false
    }

    private fun showdice4(){
        dice1.visibility=View.GONE
        dice2.visibility=View.GONE
        dice3.visibility=View.GONE
        dice4.visibility = View.VISIBLE
        dice5.visibility=View.GONE
        dice6.visibility= View.GONE
        button.isEnabled=false
       }

    private fun showdice5(){
        dice1.visibility=View.GONE
        dice2.visibility=View.GONE
        dice3.visibility=View.GONE
        dice4.visibility = View.GONE
        dice5.visibility=View.VISIBLE
        dice6.visibility= View.GONE
        button.isEnabled=false
    }
    private fun showdice6(){
        dice1.visibility=View.GONE
        dice2.visibility=View.GONE
        dice3.visibility=View.GONE
        dice4.visibility = View.GONE
        dice5.visibility=View.GONE
        dice6.visibility= View.VISIBLE
        button.isEnabled=false
    }


    private fun buttonenable()
    {

        button.isEnabled = true
    }


    fun ButtonClicked( view: View ) {
        val x=(1..6).random()
        when(x){
            1-> {
                showdice1()
                dice1.playAnimation()
            }
            2-> {
                showdice2()
                dice2.playAnimation()
            }
            3-> {
                showdice3()
                dice3.playAnimation()
            }
            4-> {
                showdice4()
                dice4.playAnimation()
            }
            5-> {
                showdice5()
                dice5.playAnimation()
            }
            6-> {
                showdice6()
                dice6.playAnimation()
            }
        }

    }
}