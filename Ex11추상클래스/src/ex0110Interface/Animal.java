package ex0110Interface;

public abstract class Animal extends Creature {

	public Animal(String name, String birth) {
		super(name, birth);
	}

	// abstract method
	public abstract void getNutrient();

}
