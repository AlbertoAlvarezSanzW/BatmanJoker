package com.example.batmanjoker

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.graphics.fonts.FontStyle.FONT_WEIGHT_EXTRA_BOLD
import android.icu.lang.UCharacter.VerticalOrientation.UPRIGHT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.example.batmanjoker.R.color
import com.example.batmanjoker.R.color.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botontroleo = findViewById<Button>(R.id.botontroleada)
        val edit = findViewById<EditText>(R.id.et1)


        botontroleo.setOnClickListener {

            if (botontroleo.text.equals(getString(R.string.comenzar))) {
                edit.setVisibility(View.VISIBLE)
                botontroleo.setText(" FINALIZAR ")
            } else {

                edit.onEditorAction(EditorInfo.IME_ACTION_DONE)
                edit.clearFocus()
                batvjok(edit,botontroleo)
            }
        }
    }

    @SuppressLint("ResourceAsColor", "WrongConstant")
    fun batvjok(edit: EditText, botontroleo:Button){

        /*
           Notas para mi: TODAS las propiedades de getColor ANTES TIENES QUE METER LOS COLORES
           QUE NO SE TE OLVIDE, noob. Y que no se te olvide el R.color o --> R. LO QUE SEa
            */
        val imagensita = findViewById<ImageView>(R.id.apo)
        val change = findViewById<ConstraintLayout>(R.id.principal)
        if(edit.text.toString().toLowerCase().equals("wayne")) {
            imagensita.setImageResource(R.mipmap.ic_bat)
            botontroleo.setBackgroundColor(getColor(R.color.bat))
            //como meter un backgroud
            change.setBackgroundColor(getColor(R.color.princi))
            //como variar el texto de color:
            botontroleo.setTextColor(getColor(R.color.batletra))
            //cambiar el tipo de letra (esto funciona cuando quiere) pss
            botontroleo.setTypeface(null,Typeface.ITALIC)

            
        }else if(edit.text.toString().toLowerCase().equals("joker")) {
            imagensita.setImageResource(R.mipmap.ic_jok)
            botontroleo.setBackgroundColor(getColor(R.color.broma))
            change.setBackgroundColor(getColor(R.color.jokfondo))
            botontroleo.setTextColor(getColor(R.color.jokerletra))
            botontroleo.setTypeface(null,Typeface.NORMAL)

        }else{
            System.out.println("pues no se... hola XD")
        }
    }

}