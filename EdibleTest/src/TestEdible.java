/*Objective: Create an interface and classes that implement the behavior
 * specified in an interface.
 * Algorithm: Each object in an array is checked if they are an instance of the Edible interface and prints a String.
 * Input and Output: The output is the series of strings from the objects indicating if they are edible or not.
 * Created by: Kenya Milo
 * Date: 06/27/2024
 * Version java 20.0.2
 */
public class TestEdible {

	public static void main(String[] args) {
		//Array of objects
		Object[] objects = {new Tiger(), new Chicken(),new Fish(), new Apple(), new Pineapple()};
		//Loop through each object in the array
		for (int i=0;i<objects.length;i++) {
			//Check if object is an instance of Edible
			if(objects[i] instanceof Edible) {
				//Cast object into Edible and call howToEat method
				System.out.println(((Edible)objects[i]).howToEat());;
			}
			else
			{
				//Print statement if object is not edible
				System.out.println("Obeject is not edible");
			}
		}
	}
}
//Abstarct animal class
class Animal{
	
}
class Chicken extends Animal implements Edible{
	//Implement howToEat method 
	public String howToEat() {
		return "Chicken: Fry it";
	}
}

class Tiger extends Animal {
	
}

class Fish extends Animal implements Edible{
	//Implement howToEat method
	public String howToEat() {
		return "Fish: Grill it";
	}
}

abstract class Fruit implements Edible{
	
}

class Apple extends Fruit {
	//Implement howToEat method
	public String howToEat() {
		return "Apple: Make apple cider";
	}
}

class Orange extends Fruit{
	//Implement howToEat method
	public String howToEat() {
		return "Orange: make orange juice";
	}
}
class Pineapple extends Fruit{
	//Implement howToEat method
	public String howToEat() {
		return "Pineapple: make pineapple juice";
	}
}
