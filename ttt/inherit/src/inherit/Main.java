package inherit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee hazrat = new Employee("Hazrat","Boss",1998);
		
		int jobLife = hazrat.calculateJobLife(); 
		System.out.println("Job life:"+jobLife);
		
		int Inc = hazrat.calculateIncrement(jobLife);
		System.out.println("Increament:"+Inc);
	}

}
