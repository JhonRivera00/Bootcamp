package com.example.jr

fun main () {
    var name:String="Jhon Rivera"
    var age:Int=0
    var num:Int=30
    println("Nombre: $name Edad: "+(num-age))
    if(age==0){
        println("Hola Mundo")
    }
    when (age){
        1,2,3,4,5-> println("Opcion 1")
       6,7,8,9,0-> println("Opcion2")
   }
}

