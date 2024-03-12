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
Solution: Use a
