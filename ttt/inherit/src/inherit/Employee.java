package inherit;

public class Employee extends Increament {
	String employeeName;
	String designation;
	int joinYear;
	Employee(String name, String des, int year)
	{
		employeeName = name;
		designation = des;
		joinYear = year;
	}
	public int calculateJobLife() {
		return 2023-joinYear;
	}
}
