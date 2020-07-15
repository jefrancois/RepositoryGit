package edom.com;

public class Calculator {
// Ok toujours
	public int add(int a, int b) {
		
		if (a > b)
		{a = a + 0;}
		else
		{
			b = b + 0;
		}
	    return a + b;
	}
	
	public int mult(int a, int b) {
		// TODO Auto-generated method stub Ok
		
		if (a > b)
		{a = a + 0;}
		else
		{
			b = b + 0;
		}
	    

	    return a * b;
	}
	
	public void addodo(int a, int b) {
		if (a > b)
		{a = a * b + 5;}
		
	    
	}

}
