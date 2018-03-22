package lab05;


public class BMI 
{
	
	public static void main(String[] args)
	{
		Person per1 = new Person();
		per1.name = "Lionel Messi";
		per1.kilograms = 60.20;
		per1.heightMeters = 1.5;
		per1.greeting();
		per1.calculate();
		
		System.out.println(" " );
		
		Person per2 = new Person();
		per2.name = "Lauri Markarkanen";
		per2.kilograms = 81.20;
		per2.heightMeters = 2.1;
		per2.greeting();
		per2.calculate();
		
		System.out.println(" " );
		
		Person per3 = new Person();
		per3.name = "VIC Mensa";
		per3.kilograms = 69;
		per3.heightMeters = 1.69;
		per3.greeting();
		per3.calculate();

    
    
	
	}
	

}
