fun main() {
    oddNumbers()
    words("belyse","jennifer","tifany")
    robot(28)
    numbers()
}

fun oddNumbers(){
    for(element in 1..100){
        if (element%2!=0){
            println(element)
        }
    }
}

fun words(name1:String,name2:String,name3:String):Int {
    val x = arrayOf(name1, name2, name3)
    for (names in x) {
        if (names.length > 5) {
            return names.count()
        }

    }
}

fun robot(age:Int){
    if (age<=6){
        println("drink milk")
    }
    else if(age>6 && age<=15){
        println("drink fanta orange")
    }
    else{
        println("drink coca cola")
    }

    }
fun numbers(){
    for (number in 1..100){
        println(number*3)
        println("Fizz")
        println(number*5)
        println("Buzz")
        if (number*3==0 && number*5==0 ){
            println("FizzBuzz")
        }

}
}

