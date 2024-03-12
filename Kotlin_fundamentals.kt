//Mobile notification
fun main() {                                //Entry point of the application

    //creating variables to store the number of notifications
    val morningNotification = 51
    val eveningNotification = 135

    //printing notifications by calling the printNotificationSummary function by passing the numberOfMessages
    //argument in the function. Here, the argument is of int type and is passed as a variable
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {        //Defining the printNotificationSummary function
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}


//Movie ticket price Calculator
fun main2() {                  //Entry point for the program

    //Defining variables
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true            //Boolean expression to check if the day is Monday

    //Here, the function ticketPrice is called with the arguments passed as the variables stated above
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int { //introducing the boolean factor as parameter to check whether the day is Monday
    return when(age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30   //If isMonday boolean is true, then it is 25
        in 61..100 -> 20
        else -> -1
    }
}


//Temperature Converter
fun main3() {

    //In this main function, the program calls the printFinalTemperature function every time there is a conversion to be made
    //When the printFinalTemperature function is called, the initialMeasurement, initialUnit and the finalUnit arguments are passed
    //'it' is a lambda expression that is expected when the program calls printFinalTemperature,
    // because one of the parameters of printFinalTemperature is a lambda
    //'it' now represents the 2dp double value 
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double   //This is a lambda expression that returns a value of type Double, the parameter of the function is Double as well
) {
    //String.format means that the end result of the function will be converted to a string before it is stored in the finalMeasurement variable.
    //in the String.format method, conversionFormula() function, which is defined in the parameters of printFinalTemperature function is called.
    //the conversionFormula() function returns a double value that is trimmed to 2dp by the "%.2ff"
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
