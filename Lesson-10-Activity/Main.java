
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println(isGraduating(12, 45));

  }
	double gpa(int Gpa){
		if(Gpa > 90)
			return Gpa * 1.1;
		else 
			return Gpa;
	}

	boolean isGraduating(double GrdLvl, double credits){
		if(GrdLvl >= 12 && credits >= 44)
			return true;
		else 
			return false;
	}

	String BMI(double weight, double height){
		double bmi = weight / (height * height);
		if(bmi < 18.5)
			return "Underweight";
		else if(bmi >= 18.5 && bmi <= 24.9)
			return "Normal weight";
		else if(bmi >= 25 && bmi <= 29.9)
			return "Overweight";
		else 
			return "Obese";
	}


	boolean blueOrViolet(double lightFrequency){
		if(600 <= lightFrequency && lightFrequency <= 670 || 700 <= lightFrequency && lightFrequency <= 750)
			return true;
		else 
			return false;
	}


  
}