package com.mycode

/*
 * Copyright 2012 Damian Helme

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
   */
object App {
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    
    val myList = List(1,2,3)
    println("Length of " + myList + " is: " + listLength(myList))
  }
  
  def listLength[A](list: List[A]) : Int = {
    list match {
      case Nil => 0
      case head :: tail => 1 + listLength(tail)
    }
  }
}
