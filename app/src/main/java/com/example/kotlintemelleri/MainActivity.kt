package com.example.kotlintemelleri

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }




        println("Hello")

        //Variables

        //Defining
        var fullname : String

        //Initialize
        fullname = "Nursel ALTIN"


        var age :Int
        age = 25

        //Constants
        val  phone : Int = 53023888


        println("-----------Double - Float---------------")

        //Double - Float

        val pi : Double = 3.14
        var a :Int = 23

        println(a/2)
        var b : Double = 23.0

        println(b/2)
        //println(pi*2)

        //println("Merhaba ben "+fullname+" , yaşım "+age+", tel = "+phone)

        println("-----------String---------------")

        var myString = "nursel Altın"
        println( myString.capitalize())

        println("-----------Conversion---------------")

        var stringVar = "10"

        println(stringVar.toInt() * 2)


        println("-----------Collections---------------")

        var myArray = arrayOf("James","Rob","Alice")

        println(myArray[2])
        println(myArray.size)
        myArray[1] = "Nursel"
        println(myArray[1])




    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}



