package com.cdp.pantalla1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Encuentra el botón por su ID
        val button1 = findViewById<Button>(R.id.button1)

        // Configura el OnClickListener
        button1.setOnClickListener {
            //Muestra el mensaje del boton
            Toast.makeText(this, "PRESIONASTE EL BOTON", Toast.LENGTH_LONG).show()
            // Crea un Intent para iniciar Screen2Activity
            val intent = Intent(this,pantalla2::class.java)
            startActivity(intent)
        }

    }



}




