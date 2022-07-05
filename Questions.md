### 1.	WAP to find & display the addition, subtraction, multiplication and division on two numbers.
```
import java.util.*;

class learnJava
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition= "+ c);
		c=a-b;
		System.out.println("Subtraction= "+ c);
		c=a*b;
		System.out.println("Multipication= "+ c);
		
	}
}

```