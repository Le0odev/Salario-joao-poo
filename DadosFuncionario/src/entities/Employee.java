package entities;

public class Employee {

		public String name;
		public double grossSalary;
		public double tax;
		
		
		
		public double NetSalary() {
			
			return grossSalary - tax;
		}
		
		
		public  double IncreaseSalary(double percentage) {
			return grossSalary += grossSalary *percentage / 100;
		}
		
		
		
		
		
		
		
		
		public String toString() {
			return name
			      + ", $ "
			      + String.format("%.2f", NetSalary());
			      
					
		}
	

}
