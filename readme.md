### 1.	WAP to find & display the addition, subtraction, multiplication and division on two numbers.
```
import java.util.*;

class LearnJava
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition= "+ c);
		c=a-b;
		System.out.println("Subtraction= "+ c);
		c=a*b;
		System.out.println("Multiplication= "+ c);
		float d=(float)b/a;
        System.out.println("Division= "+ d);
	}
}

```
### 2. WAP to initialize a one-D array with even numbers and find & display the sum and average of elements.
```
import java.util.*;

class LearnJava
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many even nunmbers you want to print: ");
		int a= sc.nextInt();
		int myNum[]=new int[a];
		for (int i = 0; i < a; i++) {
          myNum[i]=i*2;
        }
        for (int i = 0; i < a; i++) {
          System.out.println(myNum[i]+" ");
        }
	}
}
```

### 3.	WAP of multiplication of two matrices.
```
import java.util.*;

class LearnJava
{
	public static void main (String[] args) 
	{
	
		int myNum[]={1,2,3,4,5};
		int myNum2[]={6,7,8,9,10};
		for(int i=0;i<5;i++){
		    System.out.println(myNum[i]*myNum2[i]);
		}
	}
}

```
### 4.	WAP to use a recursive function to display the counting in reverse order.
```
import java.util.*;

class LearnJava
{
	public static void main (String[] args) 
	{
	    int a=0;
		reverse(a);
	}
	
	public static void reverse(int k) {
    if (k == 5) {
      return ;
    } 
    reverse(++k);
    System.out.print(k+" ");
    return ;
  }
}
```

