package application;

public class App {

	public static void main(String[] args) {
		
		int cats = 5;
		
		System.out.println(cats++);
		System.out.println(cats);
		/* First print shows the original value of cats,
		 * THEN it increments the value, which is why the
		 * second print shows the incremented value.
		 * IOW, postfix means the increment happens POST the
		 * operation.
		 */
		
		int dogs = 3;
		
		System.out.println(++dogs);
		/* In the prefix case, the variable is incremented
		 * FIRST, then printed out
		 */
		
		int giraffes = 10;
		int animals = cats + giraffes++;
		/* Should return 16 (6 cats and 10 giraffes)
		 * After the results are printed, THEN giraffes
		 * are incremented.
		 */
		System.out.println(animals);
		
		//And now giraffes is 11 since it was incremented
		System.out.println(giraffes);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		//fruits should be 10
		System.out.println(fruits);
	}

}
