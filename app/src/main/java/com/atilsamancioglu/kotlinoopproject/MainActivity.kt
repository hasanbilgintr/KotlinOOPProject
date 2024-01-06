package com.atilsamancioglu.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
       var myUser = User("James",50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())


        //encapsulation

        var james = Musician("James","Guitar",55)
        println(james.age.toString())
        println(james.returnBandName("Atil"))
        println(james.returnBandName("Kirk"))


        //inheritance
        //sınıflar sadece 1 sınıf inherit alabilirler
        var lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        println(lars.returnBandName("Atil"))
        lars.sing()

        //polymorphism

        //static polymorphism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))


        //dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        // abstract & interface

        //abstract sınıftan örnekleme yapamazsın

        //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions

        fun printString(myString : String) {
         println(myString)
        }

     printString("My Test String")

     //burda 1 strign parametre ister printl metodunu kullanır onada kendi parameteresini verir
     val testString = {myString : String -> println(myString)}


     testString("My Lambda String")
     //My Lambda String yazdırır

     //iki parametere ister ve a*b sonuç dmdürür
     val multiplyLambda = {a: Int, b: Int -> a * b }

     //20 verir
     println(multiplyLambda(5,4))

     //2 int ister int döndürür a ilk paramtere eşitler ikinci parametre b dir a*b verir kısaca bi önceki ile aynı aslında
     val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
     //25 verir
     println(multiplyLambda2(5,5))

     //asynchrnous //senkronie olmayan

     //callback function, listener function, completion function
     //fonsiyonu kullanırken string ister ve sonunda muscian döndürür
     fun downloadMusicians(url: String, completionName : (Musician) -> Unit) {
      //url -> download
      //data
      val kirkHammet = Musician("Kirk","Guitar",60)
      completionName(kirkHammet)
     }

     downloadMusicians("metallica.com",{
      println(it.name)
     })//aynı

     downloadMusicians("metallica.com",{musician->
      println(musician.name)
     })

    }
}
