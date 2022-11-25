package com.example.jr
import com.google.gson.annotations.SerializadName
data class DogsResponse(
   var status:String,
   var images:List<String>) {
}