package com.ft.seekbaruwu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity(), OnSeekBarChangeListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<SeekBar>(R.id.seekbar).setOnSeekBarChangeListener(this)

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        findViewById<TextView>(R.id.progress).text = progress.toString()

        findViewById<TextView>(R.id.seekbarStatus).text = "Tracking touch"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        findViewById<TextView>(R.id.seekbarStatus).text = "Started Tracking Touch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        findViewById<TextView>(R.id.seekbarStatus).text = "Stopped Tracking touch"
        Toast.makeText(this,seekBar!!.progress.toString()+"%",Toast.LENGTH_SHORT).show()
    }
}