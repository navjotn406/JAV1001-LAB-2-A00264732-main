//name Navjot Singh
//Student ID A00264732
//jav1001-lab-3 arraytools


fun main(){

//first function ceasarcipher
ceasarcipher()

//second function collect the average of a given array
println("\nAverage of number is : " + average())

//third function check whether a number is present in an array or not
var isFound = searchNumber()
if(isFound)
println("The number is found.")
else
println( "The number is not found.")

//fourth function to reverse a given arary
var reversedArray =  reverseIntArray()
println("Reversed Array: "+ printIntarray(reversedArray))



}

//fun ceasarcipher to encrypt a given text
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

  for(i in 0 until arraySize/2){

    val aux = arr[i]
    arr[i] = arr[arraySize - 1 - i ]
    arr[arraySize - 1 - i] = aux
  }

}


//arrContain: search a value in an array

fun searchNumber():Boolean{
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

  return found

}

fun printIntarray(array:IntArray):String {
  var result = "[ "

  for (i in array){
  result = result + i + " "
}
result += "]"
return result
}
