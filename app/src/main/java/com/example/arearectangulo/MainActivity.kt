package com.example.arearectangulo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var altura: Double = 0.0
    var base: Double = 0.0
    var area: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CalcularArea(v: View){
        if(etAltura.text.isEmpty() || etBase.text.isEmpty()){
            Toast.makeText(this,"Faltan valores",Toast.LENGTH_LONG).show()
            etAltura.requestFocus()
        }
        else{
            altura = etAltura.text.toString().toDouble()
            base = etBase.text.toString().toDouble()
            area = base*altura
            val enviar = Intent(this,ActivityRes::class.java)
            enviar.putExtra(ActivityRes.EXTRA_Altura, altura)
            enviar.putExtra(ActivityRes.EXTRA_Base, base)
            enviar.putExtra(ActivityRes.EXTRA_Area, area)
            startActivity(enviar)
        }
    }
}
