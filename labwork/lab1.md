## Due Date : 12/16/2021  Submitted date: 12/16/2021
# Write a program to demonstrate all three types of constructors in java
'''
```
class ThreeConstructors{
	String shuvam;
	public ThreeConstructors(){
		System.out.println("Default Constructor");
	}
	public ThreeConstructors(String shuvam){
		this.shuvam = shuvam;
		System.out.println("Parameterized Constructor:"+shuvam);
	}
	public ThreeConstructors(Constructors c){
		System.out.println("This is Copy Constructor:"+c.shuvam);
	}
	public static void main(String[] args){
		Constructors defaultConstructor = new Constructors();
		Constructors parameterizedConstructor = new Constructors("");
		Constructors copyConstructor = new Constructors(parameterizedConstructor);
	}	
}
```
 
 
 
# Write a program to implement stack using array
'''
public class Stack<E> {
	private E[] arr = null;
	private int CAP;
	private int top = -1;
	private int size = 0;
 
	@SuppressWarnings("unchecked")
	public Stack(int cap) {
		this.CAP = cap;
		this.arr = (E[]) new Object[cap];
	}
 
	public E pop() {
		if(this.size == 0){
			return null;
		}
 
		this.size--;
		E result = this.arr[top];
		this.arr[top] = null;//prevent memory leaking
		this.top--;
 
		return result;
	}
 
	public boolean push(E e) {
		if (isFull())
			return false;
 
		this.size++;
		this.arr[++top] = e;
 
		return true;
	}
 
	public boolean isFull() {
		if (this.size == this.CAP)
			return false;
		return true;
	}
 
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
 
	public static void main(String[] args) {
 
		Stack<String> stack = new Stack<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
	}
}
'''
 
 
# Write a program to implement uses of Abstract Class .
 
'''
package com.java.abstractTest.example;
 
abstract class Shape
{
 double a, b;
 Shape(double d1, double d2)
 {
  a = d1;
  b = d2;
 }
 abstract double area();
}
 
class Circle extends Shape
{
 Circle(double radius)
 {
  super(radius, 0); 
 }
 double area()
 {
  return Math.PI * a * a;
 }
}
 
class Rectangle extends Shape
{
 Rectangle(double length, double breadth)
 {
  super(length, breadth);
 }
 double area()
 {
  return a * b;
 }
}
 
public class AbstractTest
{
 public static void main(String[] args)
 {
  Shape shape;
  shape = new Circle(5);
  System.out.println("Area of circle =" +
    " " + shape.area());
 
  shape = new Rectangle(5, 10);
  System.out.println("Area of rectangle = " 
  + shape.area());
 }
}
'''
 
 
# Write a program to achieve multiple inheritance in java
 
 '''
 package inheritance;
 interface Writeable
{
    void writes();
}
interface Readable 
{   
    void reads();
 
}
class Student implements Readable,Writable
{
    public void reads()
    {
    stem.out.print(“Student reads.. ”);
    }
    public void writes()
    {
    System.out.print(“ Student writes..”);
    }
 
    public static void main(String args[])
    {
    Student s = new Student();
    s.reads();
    s.writes();
    }
}
'''
 
# Write a program to find sum and difference of two numbers using command line arguments
 
'''
   class addition
   {
   	public static void main(String []
   	args)
  {
   	int number1=Integer.parseInt(args[0]);
   	int number2=Integer.parseInt(args[1]);
   	int result=number1+number2;
   	System.out.println("the first number is \t"+number1);
   	System.out.println("the second number is \t"+number2);
 
   	System.out.println("the result is \t"+result);
 
   }
}
'''
 
# Write a program to demonstrate use of this, super and final
 
#Super Keyword
'''
//program to demonstrate super keyword
/* Base class vehicle */
class Vehicle
{
    int maxSpeed = 120;
}
 
/* sub class Car extending vehicle */
class Car extends Vehicle
{
    int maxSpeed = 180;
 
    void display()
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
 
/* Driver program to test */
class Test
{
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
 
'''
#This Keyword
'''
/ Program to illustrate this keyword
// is used to refer current class
class RR {
    // instance variable
    int a = 10;
 
    // static variable
    static int b = 20;
 
    void GFG()
    {
        // referring current class(i.e, class RR)
        // instance variable(i.e, a)
        this.a = 100;
 
        System.out.println(a);
 
        // referring current class(i.e, class RR)
        // static variable(i.e, b)
        this.b = 600;
 
        System.out.println(b);
    }
 
    public static void main(String[] args)
    {
      new RR().GFG();
    }
}
 
#Final Keyword
'''
//program to illustrate finalkeyword
class FinalKeyword
{
    final int collageCode=621;
 
    void display()
    {
        System.out.println("Collage Code is "+collageCode);
 
        // this reassignment of final variable generates error
        collageCode=622; // comment this line for see proper output
    }
    public static void main(String arg[])
    {
        FinalKeyword f=new FinalKeyword();
        f.display();
    }
}
 
 
 
# Write a program to demonstrate the use of default method in the interface.
```
// methods in java
interface TestInterface
{
    // abstract method
    public void square(int a);
 
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
 
class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
 
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
 
        // default method executed
        d.show();
    }
}
```
# Write a program to demonstrate the use of static methos and static variable
```
class Student
{
String name;
int roll;
String program;
static int co
Student(String n, int r, String p)
{
System.out.println("Object Created");
name = n;
roll = r;
program-p;
count++;
}
void display()
{
System.out.println("Name:" + name);
System.out.println("Roll Number:" + roll);
System.out.println("Program:" + program);
System.out.println();
}
static void displayCount()
{
	System.out.println("Number of students"
)
+ count);
)
class StaticDemo
{
public static void main(String [args)
Student displayCount();
Student x = new Student ("Sund1", 1, "CSIT");
Student y = new Student("Ron1", 2, "CSIT");
Student z = new Student("Prakash", 3, "CSIT");
Student.displayCount();
System.out.println("\nStudent Records");
x.display();
y.display();
z.display();
    }
 }   
```
 
RAW Paste Data
## Due Date : 12/16/2021  Submitted date: 12/13/2021
# Write a program to demonstrate all three types of constructors in java
'''
```
class ThreeConstructors{
	String shuvam;
	public ThreeConstructors(){
		System.out.println("Default Constructor");
	}
	public ThreeConstructors(String shuvam){
		this.shuvam = shuvam;
		System.out.println("Parameterized Constructor:"+shuvam);
	}
	public ThreeConstructors(Constructors c){
		System.out.println("This is Copy Constructor:"+c.shuvam);
	}
	public static void main(String[] args){
		Constructors defaultConstructor = new Constructors();
		Constructors parameterizedConstructor = new Constructors("Naruto");
		Constructors copyConstructor = new Constructors(parameterizedConstructor);
	}	
}
```



# Write a program to implement stack using array
'''
public class Stack<E> {
	private E[] arr = null;
	private int CAP;
	private int top = -1;
	private int size = 0;
 
	@SuppressWarnings("unchecked")
	public Stack(int cap) {
		this.CAP = cap;
		this.arr = (E[]) new Object[cap];
	}
 
	public E pop() {
		if(this.size == 0){
			return null;
		}
 
		this.size--;
		E result = this.arr[top];
		this.arr[top] = null;//prevent memory leaking
		this.top--;
 
		return result;
	}
 
	public boolean push(E e) {
		if (isFull())
			return false;
 
		this.size++;
		this.arr[++top] = e;
 
		return true;
	}
 
	public boolean isFull() {
		if (this.size == this.CAP)
			return false;
		return true;
	}
 
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
 
	public static void main(String[] args) {
 
		Stack<String> stack = new Stack<String>(11);
		stack.push("hello");
		stack.push("world");
 
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
 
		stack.pop();
		System.out.println(stack);
	}
}
'''


# Write a program to implement uses of Abstract Class .

'''
package com.java.abstractTest.example;

abstract class Shape
{
 double a, b;
 Shape(double d1, double d2)
 {
  a = d1;
  b = d2;
 }
 abstract double area();
}

class Circle extends Shape
{
 Circle(double radius)
 {
  super(radius, 0); 
 }
 double area()
 {
  return Math.PI * a * a;
 }
}

class Rectangle extends Shape
{
 Rectangle(double length, double breadth)
 {
  super(length, breadth);
 }
 double area()
 {
  return a * b;
 }
}

public class AbstractTest
{
 public static void main(String[] args)
 {
  Shape shape;
  shape = new Circle(5);
  System.out.println("Area of circle =" +
    " " + shape.area());
  
  shape = new Rectangle(5, 10);
  System.out.println("Area of rectangle = " 
  + shape.area());
 }
}
'''


# Write a program to achieve multiple inheritance in java
 
 '''
 package inheritance;
 interface Writeable
{
    void writes();
}
interface Readable 
{   
    void reads();
     
}
class Student implements Readable,Writable
{
    public void reads()
    {
    stem.out.print(“Student reads.. ”);
    }
    public void writes()
    {
    System.out.print(“ Student writes..”);
    }
 
    public static void main(String args[])
    {
    Student s = new Student();
    s.reads();
    s.writes();
    }
}
'''

# Write a program to find sum and difference of two numbers using command line arguments

'''
   class addition
   {
   	public static void main(String []
   	args)
  {
   	int number1=Integer.parseInt(args[0]);
   	int number2=Integer.parseInt(args[1]);
   	int result=number1+number2;
   	System.out.println("the first number is \t"+number1);
   	System.out.println("the second number is \t"+number2);

   	System.out.println("the result is \t"+result);

   }
}
'''

# Write a program to demonstrate use of this, super and final

#Super Keyword
'''
//program to demonstrate super keyword
/* Base class vehicle */
class Vehicle
{
    int maxSpeed = 120;
}
  
/* sub class Car extending vehicle */
class Car extends Vehicle
{
    int maxSpeed = 180;
  
    void display()
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
  
/* Driver program to test */
class Test
{
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}

'''
#This Keyword
'''
/ Program to illustrate this keyword
// is used to refer current class
class RR {
    // instance variable
    int a = 10;
 
    // static variable
    static int b = 20;
 
    void GFG()
    {
        // referring current class(i.e, class RR)
        // instance variable(i.e, a)
        this.a = 100;
 
        System.out.println(a);
 
        // referring current class(i.e, class RR)
        // static variable(i.e, b)
        this.b = 600;
 
        System.out.println(b);
    }
 
    public static void main(String[] args)
    {
      new RR().GFG();
    }
}

#Final Keyword
'''
//program to illustrate finalkeyword
class FinalKeyword
{
    final int collageCode=621;
    
    void display()
    {
        System.out.println("Collage Code is "+collageCode);
        
        // this reassignment of final variable generates error
        collageCode=622; // comment this line for see proper output
    }
    public static void main(String arg[])
    {
        FinalKeyword f=new FinalKeyword();
        f.display();
    }
}



# Write a program to demonstrate the use of default method in the interface.
```
// methods in java
interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
  
        // default method executed
        d.show();
    }
}
```
# Write a program to demonstrate the use of static methos and static variable

'''
class Student
{
String name;
int roll;
String program;
static int co
Student(String n, int r, String p)
{
System.out.println("Object Created");
name = n;
roll = r;
program-p;
count++;
}
void display()
{
System.out.println("Name:" + name);
System.out.println("Roll Number:" + roll);
System.out.println("Program:" + program);
System.out.println();
}
static void displayCount()
{
	System.out.println("Number of students"
)
+ count);
)
class StaticDemo
{
public static void main(String [args)
Student displayCount();
Student x = new Student ("Sund1", 1, "CSIT");
Student y = new Student("Ron1", 2, "CSIT");
Student z = new Student("Prakash", 3, "CSIT");
Student.displayCount();
System.out.println("\nStudent Records");
x.display();
y.display();
z.display();
    }
 }   
```
