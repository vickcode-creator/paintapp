package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colourList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val redBtn = findViewById<ImageButton>(R.id.redColour)
        val blueBtn = findViewById<ImageButton>(R.id.blueColour)
        val blackBtn = findViewById<ImageButton>(R.id.blackColour)
        val eraser = findViewById<ImageButton>(R.id.whiteColour)

        redBtn.setOnClickListener{
            Toast.makeText(this, "Clicked",Toast.LENGTH_SHORT ).show()
            paintBrush.setColor(Color.RED)
            currentcolour(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this, "Clicked",Toast.LENGTH_SHORT ).show()
            paintBrush.setColor(Color.BLUE)
            currentcolour(paintBrush.color)

        }
        blackBtn.setOnClickListener{
            Toast.makeText(this, "Clicked",Toast.LENGTH_SHORT ).show()
            paintBrush.setColor(Color.BLACK)
            currentcolour(paintBrush.color)

        }
        eraser.setOnClickListener{
            Toast.makeText(this, "Clicked",Toast.LENGTH_SHORT ).show()
           pathList.clear()
            colourList.clear()
            path.reset()

        }
    }
    private fun currentcolour(colour:Int){
        currentBrush = colour
        path = Path()
    }
}