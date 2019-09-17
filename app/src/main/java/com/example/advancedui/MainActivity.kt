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
        buttonSnackBarAction.setOnClickListener { showSnackBarWithAction() }
        // TODO 5) Make buttonDialog show an alertDialog
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

    private fun showSnackBarWithAction() {
        val message = getString(R.string.hello_im_dog)
        val duration = Snackbar.LENGTH_LONG
        Snackbar.make(container, message, duration).setAction(getString(R.string.action_bark)) {
            //Do whatever action you want to :3
        }.show()
    }

    private fun showDialog() {
        //TODO 1) Create an alertDialogBuilder
        //TODO 2) Create an alertDialog
        //TODO 3) Show the alertDialog
        //TODO 4) Add actions to the dialog
    }
}
