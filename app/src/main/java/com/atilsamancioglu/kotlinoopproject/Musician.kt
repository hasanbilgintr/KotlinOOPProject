package com.atilsamancioglu.kotlinoopproject

            //private constructor için bu kullnılır  içinde this.name=name eşitliyor
//sınıflar başka sınıflarda inherit alınırsa kullanılamaz ama open konursa kullanılabilir
open class Musician(name: String, instrument: String, age: Int) {

    //encapsulation

    var name : String? = name
        private set
        get


    private var instrument : String? = instrument

    //get yazan yer çağırırken ornekleme.age ulaşabiliriz onlar altında yazılmazsa get ve set kullanılamaz
    //bir taba basılı tam öleyazılır
    var age : Int? = age
        get
        private set


    private val bandName : String = "Metallica"

    fun returnBandName(password: String) : String {
        if (password == "Atil") {
            return bandName
        } else {
            return "Wrong password!"
        }
    }

}