package lab05;
import java.text.DecimalFormat;

public class Person {
	
	
	public String name ;
	public double kilograms; 
	public double heightMeters; 
	public double BMI; 
	public double count;
	
	
	public void calculate() 
	{
		BMI =  kilograms / (heightMeters * heightMeters);
		DecimalFormat f = new DecimalFormat("##.00");
		
		System.out.println(name+ "'s BMI is " +f.format(BMI));
		if (BMI<18)
			System.out.println(name+ "'s risk category is UnderWeight" );
		else if(BMI<25)
			System.out.println(name+ "'s risk category is normal weight" );
		else if(BMI<30)
			System.out.println(name+ "'s risk category is overweight" );
		else 
			System.out.println(name+ "'s risk category is OBese" );

			
			
		
		
		
		
		
		
		
	}
	public void greeting()
	{
	
	
	System.out.println("Hello, My name is " +name);

		
		
	}

}
