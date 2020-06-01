package edom.com;

public class LancementProgram {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		// Act
		int somme = calculator.add(a, b);
		
		if (somme > 0)
		{
			System.out.println(somme);
		}
		else
		{
			System.out.println("Je suis hors du sujet");
		}
			
		
		

	}

}
