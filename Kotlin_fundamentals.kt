package com.example.droneapp.ui.theme

//Mobile notification
private fun main() {                                //Entry point of the application

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
    println("The movie ticket price for a person aged $child is a children's ticket that costs \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is a standard ticket that costs\$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is a senior's ticket that costs\$${ticketPrice(senior, isMonday)}.")
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
    //'it' is a parameter reference used in place of the parameter names
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
    //the conversionFormula() function receives an argument of Double type and returns a Double type value that is trimmed to 2dp by the "%.2ff"
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}


//Song Catalogue
fun main4() {               //Entry point of the program

    //Creating an instance of class Song in a variable:
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()          //Calling printDescription function from class Song which was passed into brunoSong variable
    println(brunoSong.isPopular)          //Printing whether the song is popular
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000         //Returns true if condition is met

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}


//Internet Profile
fun main5() {          //Entry point of the program

    //Creating variables to store the data passed in the class Person
    //Passing class Person into variables:
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    //Here, class Person is defined with constructors. Notice the hobby variable is of nullable String type
    //The referrer variable is of nullable Person type. The Person variable type is inbuilt

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Likes to $hobby. ")                           //If person has a hobby
        }
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")       //If referrer is not null
            if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")       //If referrer has a hobby
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}


//Foldable Phones
open class Phone(var isScreenLightOn: Boolean = false){      //Open class with a boolean isScreenLightOn constructor set to false
    open fun switchOn() {                                    //Open method to switch on the screen
        isScreenLightOn = true                               //switchOn changes the isScreenLightOn boolean variable to true
    }

    fun switchOff() {                                        //method to switch off the screen
        isScreenLightOn = false                              //switchOff changes the isScreenLightOn boolean variable to false
    }

    fun checkPhoneScreenLight() {                            //method to print the state of the screen. Is it on or off??
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {  //Inheriting Phone class attributes and introducing a boolean isFolded constructor set to true (Screen is folded)
    override fun switchOn() {                                 //Overriding the SwitchOn method from the open class Phone
        if (!isFolded) {                                      //if phone is not folded, isScreenLightOn becomes true
            isScreenLightOn = true
        }
    }

    fun fold() {                                              //Method defines the folded state of the phone
        isFolded = true
    }

    fun unfold() {                                            //Method defined the unfolded state of the phone
        isFolded = false
    }
}

fun main6() {
    val newFoldablePhone = FoldablePhone()              //Creates an instance of the FoldablePhone class and passes the value to a variable

    //Calling methods from parent class and child class
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}


//Special Auction
fun main7() {

    //Creating an instance of class Bid and passing that to a variable
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    //Called the auctionPrice function and passed winningBid argument to the bid parameter
    //Remember, the winningBid stores an instance of the Bid class with an amount and a bidder

    println("Item B is sold at ${auctionPrice(null, 3000)}.")
    //Here the auctionPrice function is called with null passed to the bid parameter
    //
}

class Bid(val amount: Int, val bidder: String)     //Defining class Bid with constructors

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {     //Defining a function auctionPrice with a nullable Bid class parameter
    return bid?.amount ?: minimumPrice                    //Returns amount if bid is not null and if bid is null, it returns minimumPrice
}

