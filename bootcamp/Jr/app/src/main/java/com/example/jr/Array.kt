package com.example.jr
fun main(){
    val diasSemana= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes")
    println("Dia "+diasSemana[2])
    // set para darle un nuevo valor a un valor de un arreglo
    diasSemana.set(2,"Miernes")
   println(diasSemana[2])
       //.size para ver el tamaño de un arreglo
    if(diasSemana.size==5){
        println(diasSemana[4])
    }
    //.forEach para recorrer un arreglo
    diasSemana.forEach {
        //it para ver los valores que tiene el arreglo
        println(it)
    }
    //.first() Para ver el primer valor de un arreglo
    println(diasSemana.first())

    //.last() Para ver el ultimo valor de un arreglo
    println(diasSemana.last())


}