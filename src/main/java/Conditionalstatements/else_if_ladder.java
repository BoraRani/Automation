package Conditionalstatements;

public class else_if_ladder {
	public static void main(String[] args) {
		int marks=75;
		if(marks>=65) {
			System.out.println("Pass in first class indistinction");
		}
		else if(marks>=55) {
			System.out.print("pass in first class");
		}
		else if(marks>=45) {
			System.out.print("pass in 2nd class");
		}
		else if(marks>=35) {
			System.out.println("passed in 3rd class");
		}
		else {
		System.out.print("Sucessfully failed");
		}
	}

}
