package com.example.advancedui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener { showToast() }
    }

    private fun showToast() {
        val duration = Toast.LENGTH_LONG
        val message = getString(R.string.hello_toast)
        val toast = Toast.makeText(this, message, duration)
        toast.show()
    }
}
