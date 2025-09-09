# Test Score Calculator 

A simple Java console application that calculates the average of three test scores and assigns a letter grade. Perfect for students who want to quickly see how their test scores translate to letter grades!
Features
- Takes input for three test scores
- Calculates the numerical average
- Assigns letter grades based on standard grading scale
- Displays all results in a clean, organized format
- Input validation through Scanner
  Grading Scale
- **A**: 90-100
- **B**: 80-89  
- **C**: 70-79
- **D**: 60-69
- **F**: Below 60

 How to Use
1. Make sure you have Java installed on your computer
2. Download or clone this repository
3. Compile the program: `javac TestScores.java`
4. Run the program: `java TestScores`
5. Enter your three test scores when prompted
6. View your results!

## Sample Run
```
Enter first test score: 85
Enter the second test score: 92
Enter the third test score: 78

=== TEST SCORE RESULTS ===
The three scores you entered:
Score 1: 85.0
Score 2: 92.0
Score 3: 78.0
Average: 85.00
Letter Grade: B
```

## What I Learned
- **Scanner class** - Getting user input from the console
- **If-else statements** - Using conditional logic for grade assignment
- **Mathematical operations** - Calculating averages in Java
- **Data types** - Working with `double` for precise calculations
- **String formatting** - Using `printf` for clean decimal formatting
- **Code organization** - Writing readable, well-structured code

## Technical Details
- Uses `Scanner` for console input
- Implements if-else chain for grade determination
- Proper resource management (closes Scanner)
- Uses `double` data type for accurate decimal calculations
- Formatted output using `printf` for consistent decimal places

## Why This Project?
This was one of my early Java projects to practice fundamental programming concepts.
- Basic input/output operations
- Conditional statements
- Mathematical calculations
- User-friendly console applications

## Possible Enhancements
- Add input validation for score ranges (0-100)
- Support for more than three test scores
- Calculate GPA points

