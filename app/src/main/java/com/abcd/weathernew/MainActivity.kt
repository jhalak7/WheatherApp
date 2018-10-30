
package com.abcd.weathernew



import android.content.Intent

import android.support.v7.app.AppCompatActivity

import android.os.Bundle

import android.widget.Button

import android.widget.EditText
import com.zappycode.weather.ForecastActivity
import com.abcd.weathernew.R


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        var getForecastButton = findViewById(R.id.getForecastButton) as Button

        getForecastButton.setOnClickListener {

            var moveIntent = Intent(this, ForecastActivity::class.java)

            val searchEditText = findViewById<EditText>(R.id.searchEditText)

            moveIntent.putExtra("searchTerm", searchEditText.text.toString())

            startActivity(moveIntent)

        }

    }

}