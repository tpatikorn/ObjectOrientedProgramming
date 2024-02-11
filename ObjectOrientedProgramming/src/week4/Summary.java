package week4;

public class Summary {
	
	// primitives -- not objects -- pass by value
 	int x;
	double y;
	enum Sex {
		MALE, FEMALE
	}
	// emum = one of many things e.g. 
	//   Sex = MALE, FEMALE
	//   TrafficLightColor = RED, GREEN, BLUE
	// benefit: enum is primitive -> fast, use little memory, can use == to compare
	
	// objects -- created by class -- pass by references
	Basketball bb; 
	String s;
	
	// class           -> create objects
	// abstract class  -> class that doesn't create object, possibly incomplete
	// interface       -> a "tag" that tells what behaviors classes should have
	//                 -> have only 1) abstract method (no function body), 2) default method 3) static method
	
	// inherit         -> when properties/fields/methods passed down to subclasses/implementation
	// - extends       -> class extends class           -> subclass extends superclass
	//			       -> interface extends interface
	// - implements    -> class implements interface
	
	// @Override	   -> this function overrides function of the same name/signature in the parent
	// functions that you may override a lot
	// - equals()      -> redefines how you want 2 objects to be "same enough"
	// - toString()    -> redefines how you want to convert object to string
	// - hashCode()    -> redefines how you want to hash
	
	// public          -> anyone can access
	// [no prefix]     -> package can access
	// protected       -> this class + inherit can access
	// private         -> this class only
	
	// static method   -> method that is tied directly to **class** and NOT objects
	
	// Error handing (throw, try, catch)
	// function overloading -> same function name, different signatures
	// generic              -> define function/class signatures with variables
	
	// Useful classes
	// List ArrayList  -> magic list that is about as fast as array
	// Calendar        -> anything date time (+SimpleDateFormat)
	// System.out.println   -> print + \n
	// System.out.print

	// main function   -> the starting point for program to run
	// String args[]   -> command line arguments will be passed into args
	public static void main(String args[]) {
		
	}
}
