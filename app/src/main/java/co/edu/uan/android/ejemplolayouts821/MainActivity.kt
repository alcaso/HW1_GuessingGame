package co.edu.uan.android.ejemplolayouts821

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var randomNumber : Int = Random.nextInt(0,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myFunction(p: View) {
        val editName : EditText = findViewById(R.id.editName)
        val myTextView : TextView = findViewById(R.id.myText)
        val name = editName.text.toString()
        randomNumber = 20


        println("Hello "+name)
        Toast.makeText(this, "Hello ${name}!!", Toast.LENGTH_LONG).show()
        myTextView.text = "Hello ${name} and random number is ${randomNumber}"




    }
}