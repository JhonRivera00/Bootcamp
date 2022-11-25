package com.example.jr

fun main(){

//Para crear una lista
    val diasSemana:MutableList<String> = mutableListOf("Lunes","Martes")
    println(diasSemana)
    diasSemana.add("Miercoles")
    println(diasSemana)

    //Para agregar un dato a una lista en una poscicion
    diasSemana.add(0,"Domingo")
    println(diasSemana)

    //.filter para filtrar un dato de un arreglo va ''
    var resultado=diasSemana.filter { it[0]=='M' || it[0]=='D'}
    println(resultado)

    val diasVacia:MutableList<String> = mutableListOf()
    println(diasVacia)

    diasSemana.forEach(){
        diasVacia.add(it + ":")
    }
    println(diasSemana)
    println(diasVacia)
}