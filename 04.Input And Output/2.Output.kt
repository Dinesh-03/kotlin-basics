fun main(){

    // Inorder to print the values or the required output, we can use any of the below functions

    // 'print' function
    print() // function prints the message inside the double quotes.

    // example
    print("Hello ") // prints 'Hello ' and stays in the same line
    print("World!") // prints 'World!' and stays in the same line
    // prints the above lines in same line and doesn't leave the line in between nor goes to the beginning of the next line.


    // 'println' function
    println() // function prints the message inside the double quotes and moves to the beginning of the next line.

    // example
    println("Hello ") // prints 'Hello ' and goes to the beginning of the next line
    println("World!") // prints 'World!' and goes to the beginning of the next line
    // prints the above lines in the next next lines and goes to the beginning of the next line

    // printing values using string template '$'
    val value:Int = 5
    println(value) // prints the value of the variable 'value' as '5'
    println("value = $value") // '$' is used to print the value present in the variable

    val value2 = 3
    println("sum of value($value) and value2($value2) is $value + $value2 = ${value+value2}") // operations can also be done on values using  string templates

    println("sum of 3 and 7 is ${sum(3,7)}") // function call can also be done
}

fun sum(val1:Int, val2:Int):Int {
    return val1+val2
}