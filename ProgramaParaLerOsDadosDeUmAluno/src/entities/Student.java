package entities;

public class Student {
	public String name;
	public double firstTrimGrade;
	public double secondTrimGrade;
	public double thirdTrimGrade;
	
	public double avarage() {
		return (firstTrimGrade + secondTrimGrade + thirdTrimGrade);
	}
	
	public String isApproved() {
	    if (avarage() >= 60) {
	        return "PASS";
	    } else {
	        return "FAILED\nMISSING " + String.format("%.2f POINTS", (60.00 - avarage()));
	    }
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = "
				+ String.format("%.2f", avarage())
				+"\n"
				+ isApproved();
	}
	
}
