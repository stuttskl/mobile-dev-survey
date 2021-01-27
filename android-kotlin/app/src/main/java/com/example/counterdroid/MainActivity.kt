package com.example.counterdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.content.Intent

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        // do something
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        // intent constructor takes 2 params, a CONTEXT and a CLASS
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            // putExtra method adds the value of EditText to the intent
            putExtra(EXTRA_MESSAGE, message)
        }
        // startActivity starts an instance of the DisplayMessageActivity specified by Intent
        startActivity(intent)
    }

}