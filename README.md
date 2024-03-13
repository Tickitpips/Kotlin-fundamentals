# Kotlin-fundamentals
Understanding functions and lambda expressions in Kotlin

This is commented code based on my understanding on the practical solutions offered by developer Android.com. 
Find the problems here: https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#3

Find the solutions here: https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#8

1. Mobile notifications

This is a program to notify a user of the number of notifications received. 
Problem: The program should print to the user the exact number of notifications when there are 99 notifications or less, and printing the message “99+ notifications” when they are more than 99 notifications. 
Solution: Use a conditional statement to effect the algorithm: if there are 99 messages or less then print “You have _ notifications”, else if there are more than 99 notifications, then print “99+ notifications”.

2. Movie ticket price calculator
   
This is a program to calculate the price of a movie based on the age of a customer and a discount model.
Problem: The program should calculate the price based on the following parameters:
  1.	A children's ticket price of $15 for people 12 years old or younger.
  2.	A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
  3.	A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
When a user inputs an invalid age, the program should give a value of -1
Solution: Use a when expression to return the appropriate ticket price based on the moviegoer's age. When the age is 0-12, ticket price is $15, when the age is 13-60, ticket price is $30 and when the age is 61+, ticket price is 20. And if the day is Monday, a standard ticket price becomes $25; Else it remains $30.

3. Temperature Converter
   
This program converts temperature from one scale to another 
Problem: The program should calculate the temperatures using the formulae:
  1.	Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
  2.	Kelvin to Celsius: ° C = K - 273.15
  3.	Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
Solution: Use a function to convert data of type double into a string. This is a trivial thing to do, so incorporate it as a lambda expression passed as a parameter in the function rather than defining a function for it. Within the body of the function, call the lambda expression passed as a parameter of the function previously. In the main function, call the conversion function and pass the arguments.

5. Song Catalogue
   
This is a module that prints song information in a Music Player application. 
Problem statement: The module needs a class that represents the structure of a song. The Song class must include these code elements:
  1.	Properties for the title, artist, year published, and play count
  2.	A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
  3.	A method that prints a song description in this format: "[Title], performed by [artist], was released in [year published]."
Solution: Design a class with the properties as stated above as constructors. Within the class, define a method to get the play count and if the play count is greater than or equal to 1000, return a true Boolean value; else return a false Boolean value. Also, within the class define a method to print the title, the artist and the year of release. In the main function, call the class and store the values into a variable which will be used to print the song’s description and its popularity.

6. Internet Profile

This is a program that displays the profile of a user. The profile displays their name, age, hobby and referrer. 
Problem statement: The program should display both mandatory fields and non-mandatory fields.
Solution: Define a class with the properties set as constructors. Within the class, define a method to display the profile details of a user (Simply print the details). However, as the program prints, it should check if the values of the hobby and referrer are null. Achieve this through conditionals. 

7. Foldable Phones

This is a module to turn on the screen of a foldable phone only when it is not folded. 
Problem statement: Typically, a phone screen turns on and off when the power button is pressed. In contrast, if a foldable phone is folded, the main inner screen on a foldable phone doesn't turn on when the power button is pressed.
In the initial code provided in the following code snippet, write a FoldablePhone class that inherits from the Phone class. It should contain the following:
  1.	A property that indicates whether the phone is folded.
  2.	A different switchOn() function behavior than the Phone class so that it only turns the screen on when the phone isn't folded.
  3.	Methods to change the folding state.
Solution: The phone parent class has already been defined. Just ensure it is open so that its attributes can be inherited later. Pass a Boolean variable as a constructor in the phone class to store the state of the screen (on/off). Define methods to change the Boolean values of the screen when the phone is switched on and off. In the child class, pass a Boolean value in the constructor to store the state of the phone (folded/unfolded). Override the switchOn() method in the child class to include a conditional that checks if the phone is folded. Define two methods that change the values of the Boolean folded state of the phone. Create instances of these classes in the main function.

8. Special Auction

This program returns the price of an item based on the bids at an auction.
Problem statement: Typically in an auction, the highest bidder determines the price of an item. In a special auction, if there's no bidder for an item, the item is automatically sold to the auction house at the minimum price. The program should determine whether there is a bidder for an item and if there isn’t, the item should be sold at its minimum price. 
Solution: Define a class to get the customer bid price and their name (Pass these variables as constructors). Define a function outside of the class and use the class above as nullable parameter to cater for the absence of a bid. Pass another parameter as the minimum price. In the body of the function, define a conditional to print the value of the item when there is a bid and when there isn’t. 

