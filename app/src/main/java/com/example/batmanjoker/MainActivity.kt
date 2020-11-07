package com.example.batmanjoker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
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

    @SuppressLint("ResourceAsColor")
    fun batvjok(edit: EditText, botontroleo:Button){

        val imagensita = findViewById<ImageView>(R.id.apo)
        if(edit.text.toString().toLowerCase().equals("wayne")) {
            imagensita.setImageResource(R.mipmap.ic_bat)
            botontroleo.setBackgroundColor(getColor(R.color.bat));
            
        }else if(edit.text.toString().toLowerCase().equals("joker")) {
            imagensita.setImageResource(R.mipmap.ic_jok);
            botontroleo.setBackgroundColor(getColor(R.color.broma));
        }else{
            System.out.println("Solo por darkseid me has de aprobar");
        }
    }

}