package com.example.advancedui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener { showToast() }
        buttonSnackBar.setOnClickListener { showSnackBar() }
        // TODO 2) Make buttonSnackBarAction show a snackBar with an action
    }

    private fun showToast() {
        val duration = Toast.LENGTH_LONG
        val message = getString(R.string.hello_toast)
        val toast = Toast.makeText(this, message, duration)
        toast.show()
    }

    private fun showSnackBar() {
        val message = getString(R.string.hello_snackbar)
        val duration = Snackbar.LENGTH_LONG
        Snackbar.make(container, message, duration).show()
    }

    // TODO 1) Add snackBar with action implementation
    private fun showSnackBarWithAction() {

    }
}
