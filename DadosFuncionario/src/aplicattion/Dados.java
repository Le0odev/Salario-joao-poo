package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Dados {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Employee employee = new Employee();
		
		
		/*Solicita o nome do employer */
		
		System.out.println("Enter the employer name ->");
		employee.name = sc.nextLine();
		System.out.print("Name: " + employee.name);
		System.out.println();
		
		//Solicita o salario grosso do employer
		
		System.out.println("Enter the employer Gross Salary ->");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Gross Salary: " + employee.grossSalary);
		
		
		//Solicita a taxa que será descontada do salario grosso do colaborador//
		System.out.println();
		System.out.println("Enter the tax ->");
		employee.tax = sc.nextDouble();
		System.out.print("Tax: " + employee.tax);
		
		//Retorna informações do colaborador com a taxa de imposto//
		System.out.println();
		System.out.println("Employee: " + employee);
		
		//Solicita qual porcentagem será acrescentada no salario do colaborador
		System.out.println();
		System.out.println("Enter the percentage ->");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		//Retorna informações do salario depois de adicionar porcentagem
		System.out.println();
		System.out.println("Updatedt data: " + employee);
		
		
		
	}

}
