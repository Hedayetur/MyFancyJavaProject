import java.util.Scanner;
package creational.pattern;

public class xPart {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, Sum = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("\n The Sum of All Elements in this Array = " + Sum);
	}
}

interface Shape
{
    void draw();
}


class Circle implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a circle drawn");
     }
}


class Square implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a square drawn");
     }
}

class Rectangle implements Shape
{
     @Override
     public void draw()
     {
         System.out.println("a rectangle drawn");
     }
}


class ShapeFactory
{
 
     public Shape getShape(String type) throws Exception
     {
         switch (type)
         {
             case "Circle":
                 return new Circle();
             case "Square":
                 return new Square();
             case "Rectangle":
                 return new Rectangle();
             default:
                 throw new Exception( "Shape type : "+type+" cannot be instantiated");
         }
     }
}

class Painter
{
     public static void main(String[] args) throws Exception
     {
         
         ShapeFactory shapeFactory = new ShapeFactory();
         Shape circle=shapeFactory.getShape("Circle");
         circle.draw();
         Shape square = shapeFactory.getShape("Square");
         square.draw();
         
         Shape rombus = shapeFactory.getShape("Rombus");
         rombus.draw();
     }
}