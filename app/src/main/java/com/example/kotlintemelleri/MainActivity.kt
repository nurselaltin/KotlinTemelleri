package com.example.kotlintemelleri

import android.os.Bundle
import android.view.CollapsibleActionView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

     var name=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


      /*

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


        println("-----------Collections-Arrays---------------")

        var myArray = arrayOf("James","Rob","Alice")

        println(myArray[2])
        println(myArray.size)
        myArray[1] = "Nursel"
        println("element 1: ${myArray[1]}")

        println("-----------List---------------")

        //List , array göre daha esneklik sağlıyor.

        //Array oluştruduğumuz anda değer veriyoruz ve array içine yeni bir değer ekleyemiyoruz
        var myArray2 = arrayOf("Nursel");

        //List ise hem array özelliklerini  hem de ekstra özellikleri kullanabiliyoruz.

        var myArrayList = ArrayList<String>()

        myArrayList.add("Nursel")
        myArrayList.add("Altın")

        //Mixed olarakta kullanabilyoruz

        var myMixedList = ArrayList<Any>()
        myMixedList.add(2)
        myMixedList.add("Nursel")
        myMixedList.add(10.2)

        println(myMixedList[0])
        println(myMixedList[1])
        println(myMixedList[2])

        println("-----------Set---------------")
         //Bir eleman dizide 2.kez kullanılamaz

        var mySet = setOf<Int>(1,2,2,3)
        println(mySet.size)
        mySet.forEach{ println(it)}


        println("-----------MAP-HasMap--------------")

        //Önce array ile yapalım

        var myArrayNames = arrayOf("Nursel","Veli")
        var myArrayNumbers = arrayOf(1,2)

        // Bunu map ile daha kolay bir şekilde yapabiliyoruz
        println("${myArrayNames[0]}: ${myArrayNumbers[0]}" )


        //Key- value şeklinde verileri tutuyor
        //hashMapOf ,HashMap
        var myMapArray = hashMapOf<String,Int>()
        myMapArray.put("Ayşe",1);
        myMapArray.put("Veli",2);
        println(myMapArray["Ayşe"])

        var myHashMap = hashMapOf<String,String>("Ayşe" to "Altın","Veli" to "AK")

        println("-----------Kontroller-WHEN,IF--------------")


        var day  = 3 ;
        var dayName = "";

        if(day == 1){

            dayName = "Monday"
        }else if(day ==2 ){
            dayName = "Tuesday"
        }else if(day == 3){
            dayName = "Wednesday"
        }else{
            dayName=""
        }

        //When ile

        when(day){
            1->dayName="Modnay"
            2->dayName="Tuesday"
            3->dayName="Wednesday"
            else->dayName =""
        }

        println(dayName)

        println("-----------LOOPS--------------")

        //FOR LOOPS

        val myArrayNumber = arrayOf(12,21,30,48,54)
        //0. elemanı 3'e böl 5 ile çarp yenir değişkene ata ve yazdır.

        for(number in myArrayNumber){
            var x = number / 3 * 5;
            println(x)
        }


        val myArrayFullnames = arrayListOf<String>();
        myArrayFullnames.add("James")
        myArrayFullnames.add("Jack")
        myArrayFullnames.add("Alice")

        //for loops
        println("-----For-------")
        for(i in myArrayFullnames.indices){
            println(myArrayFullnames[i])
        }
        //foreach

        println("-----Foreach-------")
        myArrayFullnames.forEach{ println(it)}


        val myArrayFullnamesMap = hashMapOf<String,String>()
        myArrayFullnamesMap.put("Ayşe","AK");
        myArrayFullnamesMap.put("Nursel","altın")

        println("-----For-------")
        for(lastname in myArrayFullnamesMap){
            println(lastname)
        }
        println("-----Foreach-------")
        myArrayFullnamesMap.forEach{println(it)}

       */

        println("-------CLASSESS AND FUNCTIONS--------")

          //Void-Unit bir fonksiyondur.Herhangi bir döndürmeyen fonksiyon.
          sum(2,3)

          //Return
         var sumValue = sum2(10,30)
         //textView.text = "${sumValue}";


        println("-------CLASSES------")

       /* var human = Human("Nursel","Mat",25)

        println(human.name)

        human.name= "Veli"
        human.age= 16
        human.job= "Mat"

        println(human.name)

        */


    }

     fun makeHuman(view :View){

          name = nameText.text.toString()
         /*Hiçbir değer  veya string girilmediğinde ne yapmalıyız?Peki biz böyle bir durumda ne yapacağız?Örneğin age değerini girmemiş olsun
         1)toInt yerine toIntOrNull() yazabiliriz.Daha sonra Human sınıfımızda age özelliğiizi age? olarak yazarız.null değeri alabilir diyoruz
          böylelikle
          -Eğer ki null olarak yazılmasını istemiyorsak değerini 0 eşitleyerek bu işi halledebiliriz.

          */
         //var age =  ageText.text.toString().toInt()
         var age =  ageText.text.toString().toIntOrNull()
         if(age == null){
             age = 0
         }


         val job = jobText.text.toString()

         //Daha güvenli hale getirmek için yani null değeri gelirse uygulamanın çökmemesi için

         val human = Human(name,age,job)
         resultText.text = "Name: ${human.name} , Age: ${human.age} , Job: ${human.job}"
     }

     fun scope(view:View){

         println(name)

     }


    fun sum(a:Int, b:Int){
        //Sonucu textview içine yazıracağız.

       // textView.text = "Result: ${a+b}";

    }

    fun sum2(x:Int,y:Int) : Int {
        return x * y;
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



