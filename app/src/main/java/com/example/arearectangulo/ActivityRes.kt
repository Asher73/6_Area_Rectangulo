package com.example.arearectangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_res.*

class ActivityRes : AppCompatActivity() {
    var altura: Double = 0.0
    var base: Double = 0.0
    var area: Double = 0.0

    companion object {
        val EXTRA_Altura ="Altura"
        val EXTRA_Base ="Base"
        val EXTRA_Area ="Area"
        private val DEFAULT_DOUBLE = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)

        val recibir = intent
        altura = recibir.getDoubleExtra(EXTRA_Altura, DEFAULT_DOUBLE)
        base = recibir.getDoubleExtra(EXTRA_Base, DEFAULT_DOUBLE)
        area = recibir.getDoubleExtra(EXTRA_Area, DEFAULT_DOUBLE)

        tvaltura.setText("Altura: " + altura.toString() + "cm")
        tvbase.setText("Base: " + base.toString() + "cm")
        tvarea.setText("Area: " + area.toString() + "cm")
    }
}
