package prob6;

import java.util.Scanner;

public class CalcApp 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		while( true ) 
		{
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			String operatorArray[] = {"+", "*", "-", "/"};
	
			/*  코드를 완성 합니다 */
	
			if (expression.equals("exit"))
				break;
			
			loop: for (int i = 0; i < operatorArray.length; i++)
				if (expression.indexOf(operatorArray[i]) != -1 )
				{
					switch(operatorArray[i])
					{
						case "+":
							add.setValue(Integer.parseInt(expression.substring(0, expression.indexOf(operatorArray[i])).trim()),
									Integer.parseInt(expression.substring(expression.indexOf(operatorArray[i])+1, expression.length()).trim()));
							System.out.println(add.calculate());
							break loop;
							
						case "-":
							sub.setValue(Integer.parseInt(expression.substring(0, expression.indexOf(operatorArray[i])).trim()),
									Integer.parseInt(expression.substring(expression.indexOf(operatorArray[i])+1, expression.length()).trim()));
							System.out.println(sub.calculate());
							break loop;
							
						case "*":
							mul.setValue(Integer.parseInt(expression.substring(0, expression.indexOf(operatorArray[i])).trim()),
									Integer.parseInt(expression.substring(expression.indexOf(operatorArray[i])+1, expression.length()).trim()));
							System.out.println(mul.calculate());
							break loop;
							
						case "/":
							div.setValue(Integer.parseInt(expression.substring(0, expression.indexOf(operatorArray[i])).trim()),
									Integer.parseInt(expression.substring(expression.indexOf(operatorArray[i])+1, expression.length()).trim()));
							System.out.println(div.calculate());
							break loop;
							
					}
					
				}
			
		}
	}
}

class Add
{
	private int a, b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a + b;
	}

}

class Sub
{
	private int a, b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a - b;
	}
}

class Mul
{
	private int a, b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a * b;
	}
}

class Div
{
	private int a, b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a / b;
	}
}
