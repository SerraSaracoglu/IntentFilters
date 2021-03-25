package com.example.intentfiltermechanism

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browseButton:Button=findViewById(R.id.browserButton)

        browseButton.setOnClickListener {
            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com.tr/?client=safari&channel=iphone_bm")
            )
            startActivity(i)
////////////////////////////////////////////////////////////////////////
            val imageButton:Button=findViewById(R.id.imageButton)

            imageButton.setOnClickListener {
            }
///////////////////////////////////////////////////////////////////////

            val pdfButton:Button=findViewById(R.id.pdfButton)

            pdfButton.setOnClickListener {

            }


        }
        }
    }
