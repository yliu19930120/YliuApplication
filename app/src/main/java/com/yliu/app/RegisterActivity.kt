package com.yliu.app

import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            this.finish()
        }

        findViewById<Button>(R.id.sure_button).setOnClickListener {
            register()
        }
    }

    fun register(){
        val name = R.id.name_text.toString()
        println("name = ${name}")
    }
}