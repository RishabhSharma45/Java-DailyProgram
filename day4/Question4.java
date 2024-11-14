package day4;

/*
 * Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat.
 *  ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
 *  ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively.
 *   ● The program should allow the user to create and display objects of each class.
 */

class Animal{
	public void makeSound() {
		System.out.println( "The animal makes a sound.");
		}
	
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println( "barks");
		}
	
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println( "meows");
		}
}


public class Question4 {
   public static void main(String args[]) {
	   Animal animal = new Animal();
	   animal.makeSound();
	   Dog dog = new Dog();
	   dog.makeSound();
	   Cat cat = new Cat();
	   cat.makeSound();
	   
	   Animal animal2 = new Dog();
	   animal2.makeSound();
	   Animal animal3 = new Cat();
	   animal3.makeSound();
	  
	   
	   
   }
}
