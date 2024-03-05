package com.example.send

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.Display
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val mensagem = editText.text.toString()
        val intent = Intent(this, MostrarMensagemActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)

    }
}