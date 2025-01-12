package calculator;

import java.util.ArrayList;

public class GradeCalc {
	double grade;
	String letter;
	
	public GradeCalc() {
		this.grade = 0.0;
		this.letter = "";
	}
	
	public double calculateGrade(ArrayList<Double> grades, ArrayList<Double> weights) {
		this.grade = 0.0;
		
		if (grades.size() != weights.size()) { throw new IllegalArgumentException("The number of grades and weights must be the same amount."); }
		for (int i = 0; i < weights.size(); i++) { this.grade += grades.get(i) * weights.get(i); }
		
		return this.grade;
	}
	
	public String getLetterGrade(double grade) {
		if (grade >= 90) { return "A+"; }
		else if (grade >= 80) {	return "A";	}
		else if (grade >= 75) {	return "B+"; }
		else if (grade >= 70) {	return "B";	}
		else if (grade >= 65) {	return "C+"; }
		else if (grade >= 60) {	return "C";	}
		else if (grade >= 55) {	return "D+"; }
		else if (grade >= 50) {	return "D";	}
		else if (Math.abs(grade - 50) < 1) { return "E"; }
		else  {	return "F";	}
	}
	
	public double getGrade() { return this.grade; }
	public String getLetter() { return this.letter; }
	public void setLetter(String letter) { this.letter = letter; }
}

class Course {
	private ArrayList<Double> grades;
	private ArrayList<Double> weights;
	private GradeCalc calculator;
	
	public Course() {
		this.grades = new ArrayList<>();
		this.weights = new ArrayList<>();
		this.calculator = new GradeCalc();
	}
	
	public void addGrade(double grade, double weight) {
		this.grades.add(grade);
		this.weights.add(weight);
	}
	
	public void calculateFinalGrade() {
		double finalGrade = this.calculator.calculateGrade(this.grades, this.weights);
		this.calculator.setLetter(this.calculator.getLetterGrade(finalGrade));
	}
	
	public String getFinalGrade() {
		return this.calculator.getLetter();
	}
}
