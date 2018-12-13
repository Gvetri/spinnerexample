package com.codingpizza.ejemploadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var spinner2 : Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //creas una lista, en kotlin no hay " new"
        val list = ArrayList<String>()
        list.add("Juan")
        list.add("Pedro")
        list.add("Maria")
        //creas el adaptador al que vas a meterle la colecci'on de strings y le metes los layouts
        val dataAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //ASignas el adapter a spinner
        //el Spinner1 es creado con las extensiones de kotlin si tu proyecto no las tiene debes utilizar el spinner2
        spinner1.adapter = dataAdapter
        //esta es como la vieja escuela
        spinner2 = findViewById(R.id.spinner2)
        spinner2?.adapter =dataAdapter // el ? significa que si el spinner2 no es nulo asigne el adapter

        //lo que este dentro del click listener es el resultado de lo que tengas en el spinner
        btnSubmit.setOnClickListener {
                v -> Log.d("Spinner","El valor es "+ spinner1.selectedItem) // si quieres usar el spinner2 cambialo aqui
            // la " v" es view es una referencia al boton
        }

    }
}
