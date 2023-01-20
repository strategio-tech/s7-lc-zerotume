# Loan Calculator

> :warning: Technologists: you should be getting a copy of this assignment through your GitHub Classroom link, NOT through the GitHub repo URL directly! Any git commits you make should trigger the automated tests.

You take a loan from a friend and need to calculate how much you will owe them after 3 months.
You are going to pay them back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.

```
Sample Input:
20000

Sample Output:
14580
```

Here is the monthly payment schedule:
```
Month 1
Payment: 10% of 20000 = 2000
Remaining amount: 18000
Month 2
Payment: 10% of 18000 = 1800
Remaining amount: 16200
Month 3:
Payment: 10% of 16200 = 1620
Remaining amount: 14580
```

NOTES:
- You MUST also document your `getRemainingAmountIn3Months` method using [JavaDoc syntax](https://www.baeldung.com/javadoc).
- The three (the number of months) can be hard coded.
- The Java Scanner class is part of the `java.util` package and [will handle user input](https://www.programiz.com/java-programming/scanner). 
- No need to worry about cents; you can use integers for amounts.
