# input_statistics
A simple command line program written in Java 14 for a potential employer. 

## Summary
This is a program that takes user input from the command line. The user inputs a set of integers, and the program will execute calculations on the integers. The calculations it runs on the integers are as follows:

- Positive integer count
- Total input count
- Minimum
- Maximum
- Mean
- Median
- Errors

## Running the Program
1. Clone this repo
1. Navigate into the project directory
1. Compile the code with the command `javac Statistics.java`
1. Run the program with your input in this format `java Statistics x x x x` and replace the `x`'s with integers with a space in between them.

## Error handling
There is an error count in the output. The program only accepts positive integers as an input, but that will not stop the program from running. If a user adds in a string as an input, a negative number or a decimal, that will just be removed from the calculation, and added to the error count.

## Example
If the user ran the program as follows:<br>
`java Statistics 12 -7 8 96 43 0 2 18`<br>
The output would be as follows:<br>
```
Positive Integer count: 6
Total input count: 8
Minimum: 2
Maximum: 96
Mean: 29.83
Median: 15.0
Errors: 2
```
This is because we entered a negative number, and zero, and both are not positive. So we see the total input count is 8, but the positive integer count is only 6, and the error count is 2.

## Assumptions
The instructions were vague in some areas when it came to building out the program. So here are some assumptions I made when writing the code:
- If the user has an error in their input, we will not count that in any of the calculations, except the error total.
- Since zero is not technically positive, that will also be counted as an error and not be taken into account in calculation if entered by a user.
- The program sorts the integers in ascending order before finding the median.
