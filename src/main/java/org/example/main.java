package org.example;

/*
 * note the bad coding style (deliberately written for debugging exercise) 
 */
public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[10];
		for (Animal a : animals)  //the error lies here as animals[i] initially initialised as null, thus, there is no 'a' of type animal present in the loop, causing it to terminate instead of properly instantiating each element of the array to be of type Animal
			a = new Animal();   //because the elements of animals are not properly instantiated, thus leading to null errors when member functions of Animal are called on the null objects in the array.

		// my fix: replace the above for loop with below
//		for (int a = 0; a<10; a++) {
//			animals[a] = new Animal();
//		}
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {  // since all elements in the animals array are uninstantiated (null), calling .isAlive() on a null object would result in a null error , fix: no need adjustments here, just adjust the for loop above
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}	
	}
}
