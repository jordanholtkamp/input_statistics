# input_statistics
A simple command line program in Java for a potential employer.

## Summary
This is a program that takes user input from the command line. The user inputs a set of integers, and the program will execute calculations on the integers. The calculations it runs on the integers are as follows:

- Positive Integer count
- Total input count
- Minimum
- Maximum
- Mean
- Median
- Errors

## Running the program
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
```Positive Integer count: 6
Total input count: 8
Minimum: 2
Maximum: 96
Mean: 29.83
Median: 15.0
Errors: 2```
