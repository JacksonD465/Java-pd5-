class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    
  }
  void print(String text){
    System.out.println(text);
    
  }
  
  double Ftoc(double Fahrenheit){
    double result = (Fahrenheit - 32) * (5/9);
    return result;
  }

  double sphereVolume(double radius){
    double result = (4/3) * Math.PI * Math.pow(radius,3);
    return result;
  }

  double coneVolume(double radius, double height){
    double result = (1/3) * Math.PI * Math.pow(radius,2) * height;
    return result;
  }

  double distance(double x1, double x2, double y1, double y2){
    double result = Math.sqrt(((x2 - x1) * (x2 - x1)) * ((y2 - y1) * (y2 - y1)));
    return result;
  }

 
}