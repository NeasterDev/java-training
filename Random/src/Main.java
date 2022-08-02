
public class Main {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal cow = animalFactory.getAnimal("Cow");
		cow.speak();

	    // produce a dog and speak
	    Animal dog = animalFactory.getAnimal("Dog");
	    dog.speak();

	    // produce a cat and speak
	    Animal cat = animalFactory.getAnimal("Cat");
	    cat.speak();
	}

}
