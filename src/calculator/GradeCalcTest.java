package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalcTest {
	
	GradeCalc calculator;
	
	@Before
	public void setUp() {
		calculator = new GradeCalc();
	}
	
	@Test
	public void testECON1010FinalGradeCalc() {
		Course ECON1010 = new Course();
		ECON1010.addGrade(11.0/11, 7.0); // Lecture Modules
		ECON1010.addGrade(18.0/24, 2.5); // Quiz #1
		ECON1010.addGrade(20.0/24, 2.5); // Quiz #2
		ECON1010.addGrade(21.0/24, 2.5); // Quiz #3
		ECON1010.addGrade(19.0/24, 2.5); // Quiz #5
		ECON1010.addGrade(23.0/24, 2.5); // Quiz #6
		ECON1010.addGrade(21.0/24, 2.5); // Quiz #7
		ECON1010.addGrade(18.0/30, 15.0); // Test #1
		ECON1010.addGrade(19.0/30, 15.0); // Test #2
		ECON1010.addGrade(100.0/100, 15.0); // iClicker
		ECON1010.addGrade(1.0/1, 1.0); // Bonus: Course Evaluation
		ECON1010.addGrade(42.0/60, 33.0); // Final
		
		String expectedGrade = "B+";
		ECON1010.calculateFinalGrade();
		assertEquals("Grade for ECON 1010 is incorrect", expectedGrade, ECON1010.getFinalGrade());
	}
		
	@Test
	public void testEECS2001FinalGradeCalc() {
		Course EECS2001 = new Course();
		EECS2001.addGrade(96.0/100, 13.0); // Assignment #1
		EECS2001.addGrade(82.0/100, 13.0); // Assignment #2
		EECS2001.addGrade(100.0/100, 17.0); // Assignment #3
		EECS2001.addGrade(70.0/100, 13.0); // Assignment #4
		EECS2001.addGrade(2.0/2, 1.43); // Quiz #1
		EECS2001.addGrade(3.0/3, 1.43); // Quiz #2
		EECS2001.addGrade(2.0/2, 1.43); // Quiz #3
		EECS2001.addGrade(4.0/4, 1.43); // Quiz #4
		EECS2001.addGrade(2.0/4, 1.43); // Quiz #5
		EECS2001.addGrade(4.0/4, 1.43); // Quiz #6
		EECS2001.addGrade(1.0/2, 1.43); // Quiz #7
		EECS2001.addGrade(50.0/100, 35.0); // Final
		
		String expectedGrade = "B+";
		EECS2001.calculateFinalGrade();
		assertEquals("Grade for EECS 2001 is incorrect", expectedGrade, EECS2001.getFinalGrade());
	}
	
	@Test
	public void testEECS2021FinalGradeCalc() {
		Course EECS2021 = new Course();
        EECS2021.addGrade(2.0 / 2, 2.0);  // Lab A
        EECS2021.addGrade(1.2 / 1.5, 1.5);
        EECS2021.addGrade(2.0 / 2, 2.0);  // Lab B
        EECS2021.addGrade(1.2 / 1.5, 1.5);
        EECS2021.addGrade(2.0 / 2, 2.0);  // Lab C
        EECS2021.addGrade(1.5 / 1.5, 1.5);
        EECS2021.addGrade(2.0 / 2, 2.0);  // Lab D
        EECS2021.addGrade(0.66 / 1.5, 1.5);
        EECS2021.addGrade(15.0 / 15, 15.0);  // Midterm Lab Test
        EECS2021.addGrade(11.0 / 25, 25.0);  // Midterm
        EECS2021.addGrade(4.0 / 4, 4.0);  // Lab K
        EECS2021.addGrade(2.0 / 4, 4.0);  // Lab L
        EECS2021.addGrade(4.0 / 4, 4.0);  // Lab M
        EECS2021.addGrade(4.0 / 4, 4.0);  // Lab N
        EECS2021.addGrade(69.0 / 120, 30.0);  // Final

        String expectedGrade = "C+";
		EECS2021.calculateFinalGrade();
		assertEquals("Grade for EECS 2030 is incorrect", expectedGrade, EECS2021.getFinalGrade());
	}
	
	@Test
	public void testEECS2030FinalGradeCalc() {
		Course EECS2030 = new Course();
		EECS2030.addGrade(50.0/50, 0.9); // Quizzes
		EECS2030.addGrade(100.0/100, 0.9);
		EECS2030.addGrade(21.0/21, 0.9);
		EECS2030.addGrade(10.0/10, 0.9);
		EECS2030.addGrade(22.0/23, 0.9);
		EECS2030.addGrade(18.0/18, 0.9);
		EECS2030.addGrade(10.0/10, 0.9);
		EECS2030.addGrade(10.0/11, 0.9);
		EECS2030.addGrade(6.0/6, 0.9);
		EECS2030.addGrade(7.0/7, 0.9);
		EECS2030.addGrade(5.0/5, 0.9);
		EECS2030.addGrade(100.0/100, 10.0); // Labs
		EECS2030.addGrade(100.0/100, 20.0); // Test #1
		EECS2030.addGrade(87.5/100, 20.0); // Test #2
		EECS2030.addGrade(65.1/100, 20.0); // Midterm
		EECS2030.addGrade(60.5/100, 20.0); // Final
		
		String expectedGrade = "A";
		EECS2030.calculateFinalGrade();
		assertEquals("Grade for EECS 2030 is incorrect", expectedGrade, EECS2030.getFinalGrade());
	}
	
}