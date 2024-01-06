package com.atilsamancioglu.kotlinoopproject

interface Instrument {

    //java -> no body
    //kotlin -> body

    //javada body yazdırmıyordu kotlinde izin veriyor{} bu yani body yazılırsa inherit alınan sınıfta body yazmaya bilirsin body yoksa sınıfta zorunlu kılar
    fun info() {
        println("instrument info")
    }
}