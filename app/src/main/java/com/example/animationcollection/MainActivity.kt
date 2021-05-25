package com.example.animationcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.widget.NestedScrollView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFirstAni()
        initSecondAni()
    }

    private fun initFirstAni() {
        var textViewFirstArrowDown = findViewById<TextView>(R.id.textViewFirstArrowDown)
        var layoutFirstGone = findViewById<LinearLayout>(R.id.layoutFirstGone)
        textViewFirstArrowDown.setOnClickListener {
            if(layoutFirstGone.visibility == View.GONE) {
                layoutFirstGone.visibility = View.VISIBLE
            } else {
                layoutFirstGone.visibility = View.GONE
            }
        }
    }

    private fun initSecondAni() {
        var textViewSecondArrowDown = findViewById<TextView>(R.id.textViewSecondArrowDown)
        val layoutSecondGone = findViewById<LinearLayout>(R.id.layoutSecondGone)
        textViewSecondArrowDown.setOnClickListener {
            if (layoutSecondGone.visibility == View.GONE || layoutSecondGone.visibility == View.INVISIBLE) {
                layoutSecondGone.expand()
            } else if (layoutSecondGone.visibility == View.VISIBLE){
                layoutSecondGone.collapse()
            }
        }
    }
}