### 1.	WAP to find & display the addition, subtraction, multiplication and division on two numbers.
```
import java.util.*;

class LearnJava
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
## incomplete
### 5.	WAP to define a student class with name, roll no., marks1, marks2 and take the data from the user and display. Also create an object reference.
```
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Student
{
    String name;
    int roll_no;
    int marks1;
    int marks2;
    public static void getData()
	{
	   Scanner sc=new Scanner(System.in); 
	   name= sc.nextLine(); 
	   roll_no=sc.intNext();
	   marks1=sc.intNext();
	   marks2=sc.intNext();
	   
	}
	public static void putData(){
	    System.out.println(name);
	    System.out.println(roll_no);
	    System.out.println(marks1);
	    System.out.println(marks2);
	}
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Student a;
	   a.getData();
	   a.putData();
	   
	}
}




```
