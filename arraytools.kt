
// ceasarcipher function for encryption and decryption of data

import java.util.Arrays
//arrAvg function accepting an array and produces the average of all values
fun main(){

println("\nAverage of number is : " + average())
searchNumber()
reverseIntArray() 
ceasarcipher()
}

fun ceasarcipher(){
  val inputString = "Hello"
  println("Original text: " + inputString)

  val cipher: String = cipher(inputString, 5)
  println("cipher text: " + cipher)

}

private fun cipher( text: String, shift: Int):String {

  var result = ""

  val firstcharcode:Int = 'A'.toInt()
  val offset:Int = ( 'z' - 'A') + 1

  for( i in 0 until text.length ){

    val oldCharCode:Int = text[i].toInt()
    val oldIdxInAlphabet:Int = oldCharCode - firstcharcode
    val newIdxInAlphabet:Int = (oldIdxInAlphabet + shift) %offset

    val newChar:Char = (firstcharcode + newIdxInAlphabet).toChar()
    result += newChar
  }
  return result
}


//fun average to find the average of a given array
fun average(): Double{
  println("Please enter how many numbers to want: ")
  var arraySize = readln().toInt()

  var arr = IntArray(arraySize)
  var sum = 0.0

  for(i in 0 until arraySize) {
      println("Enter number  ${i+ 1} : ")
      arr[i] = readln().toInt()
      sum+=arr[i]
  }
  return sum/arraySize
}

//arrReverse function to reverse an Array
 fun reverseIntArray(){

   println("Please enter how many numbers to want: ")
   var arraySize = readln().toInt()
   var arr = IntArray(arraySize)

   for(i in 0 until arraySize) {
       println("Enter number  ${i+ 1} : ")
       arr[i] = readln().toInt()
   }
  /* println("Original Array: " + arr.joinToString(separator ",")) */

  for(i in 0 until arraySize/2){

    val aux = arr[i]
    arr[i] = arr[arraySize - 1 - i ]
    arr[arraySize - 1 - i] = aux
  }

  println("Reversed Array: "+ Arrays.toString(arr))

}

//arrContain: search a value in an array

fun searchNumber(){
  println("Please enter how many numbers to want: ")
  var arraySize = readln().toInt()
  var arr = IntArray(arraySize)

  for(i in 0 until arraySize) {
      println("Enter number  ${i+ 1} : ")
      arr[i] = readln().toInt()
  }

  println("Please enter the number to search ")
  var targetNumber = readln().toInt()

  var found = false

  for(i in arr) {
    if(i == targetNumber) {
      found = true
      break
    }
  }
  if(found)
  println("$targetNumber is found.")
  else
  println( "$targetNumber is not found.")
}
