# Course Grade Calculator

This program calculates the final grades for courses based on individual assessments and their respective weights. It also assigns letter grades based on a predefined grading scale. The program is implemented in Java and uses JUnit 4 for testing.

## Features
- **Grade Calculation**: Compute a weighted final grade based on assessment grades and their respective weights.
- **Letter Grade Assignment**: Convert the numeric grade to a letter grade using a customizable grading scale.
- **JUnit Test Cases**: Validate the correctness of the grade calculations with predefined course examples.

## Program Structure
### Classes
1. **`GradeCalc`**
   - Handles the core logic for calculating weighted grades and determining letter grades.
2. **`Course`**
   - Represents a course, allowing for the addition of grades and weights, and manages the final grade calculation.

### Key Methods
- **`GradeCalc`**
  - `calculateGrade(ArrayList<Double> grades, ArrayList<Double> weights)`: Calculates the weighted final grade.
  - `getLetterGrade(double grade)`: Returns the letter grade corresponding to the numeric grade.
- **`Course`**
  - `addGrade(double grade, double weight)`: Adds a new assessment grade and weight.
  - `calculateFinalGrade()`: Computes the final grade for the course and assigns a letter grade.
  - `getFinalGrade()`: Retrieves the letter grade for the course.

## Usage
### Example
Here’s a quick example of how to use the program:
```java
import calculator.Course;

public class GradeCalcTest {
    public void test() {
        Course course = new Course();
        course.addGrade(85.0 / 100, 50.0); // Grade: 85%, Weight: 50%
        course.addGrade(90.0 / 100, 50.0); // Grade: 90%, Weight: 50%
        
   		StringexpectedGrade = "A"  		
  		course.calculateFinalGrade();
        assertEquals("Grade for course is incorrect", expectedGrade, course.getFinalGrade());
    }
}