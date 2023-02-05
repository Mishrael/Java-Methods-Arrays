package week3;

public class week3Assign {

	public static void main(String[] args) {

	int[] ages = {3, 10, 9, 23, 64, 2, 8, 28, 93};
	//a. subtract the value of the 1st element from the value of the last.
	System.out.println(ages[0] - ages[ages.length - 1]);
	//the sum should be -90
	
	//b. Add an new value to the array to ensure it is dynamic
	// Value added to the second position: 10
	
	//c. Loop to calculate average age and Print.
	double sum = 0;
	for (double age : ages) {
		sum += age;
	}
	System.out.println(sum / ages.length);
	// Output: 26.666666666666668
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//a. loop to calculate average number of letters per name and print.
	double charLength = 0;
	for (String name : names) {
		charLength += name.length();
		}
	System.out.println(charLength / names.length);
	// Output: 3.8333333333333335
		
	//b Loop to concat the names together and print.
	String allTheNames = "";
	for (String name : names) {
		allTheNames += name + " ";
	}
	System.out.println(allTheNames);
	// Output: Sam Tommy Tim Sally Buck Bob
	
	// Last element of an array: arr[arr.length - 1]
	// first element of an array: arr[0]
	
	int[] nameLengths = new int[names.length];
	int lengths = 0;
	int counter = 0;
	for (String name : names) {
		lengths = name.length();
		nameLengths[counter] = lengths;
		counter++;
	}
//	 Checking my work
	for (int nam : nameLengths) {
		System.out.println(nam);
	}
	
	// Loop over nameLengths array, calculate the sum of the elements and print.
	int arrSum = 0;
	for (int n : nameLengths) {
		arrSum += n;
	}
	System.out.println(arrSum);
	
	//test for concat method.
	System.out.println(melange("sup",5));
	
	//test for fullName.
	System.out.println(twoString("Josh", "Stoutamyer"));
	
	//test for sumHundo.
	int[] isOverHundo = {10, 20, 30};
	System.out.println(sumHundo(isOverHundo));
	
	//test for double average method.
	double[] avgArr = {2, 2.5, 5.7, 9.0};
	System.out.println(aveArr(avgArr));
	
//	test whether sum of double[] arr1 >  sum of double[] arr2.
	double[] thisArr = {5,4.5,7,8.3};
	double[] thatArr = {3.8, 5.4, 7};
	System.out.println(twoArrShowdown(thisArr, thatArr));
	
//	test willBuyDrink.
	boolean hotOutside = true;
	double money = 10.51;
	System.out.println(willBuyDrink(hotOutside, money));
	
//	test method buyAnotherCoffee.
	boolean tired = true, gotWater = false;
	int numberOfCoffees = 1;
	double cash = 0.50;
	System.out.println(buyAnotherCoffee(tired, numberOfCoffees, cash, gotWater));
	
	}

	public static String melange(String word, int n) {
		String catWord = "";
		for (int i = 0; i < n; i++) {
			catWord += word;
		}
		return catWord;
	}
	
	public static String twoString(String firstName, String lastName) {
		String fullName = firstName.concat(" " +lastName);
		return fullName;
	}
	
	public static boolean sumHundo(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		if (sum >= 100) {
			return	true;
		} else {
		return false;
		}
	}
	
	public static double aveArr(double[] dbArr) {
		double sum = 0;
		for (double num : dbArr) {
			sum += num;
		}
		return sum / dbArr.length;
	}
	
	public static boolean twoArrShowdown(double[] arr1, double[] arr2) { 
		double sumArr1 = 0;
		double sumArr2 = 0;
		for (double number : arr1) {
			sumArr1 += number;
		}
		for (double nmb : arr2) {
			sumArr2 += nmb;
		}
			
		if (sumArr1 > sumArr2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true &&  moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
		
	}
	// method to figure out if I should buy another coffee. Tired trumps all.
	public static boolean buyAnotherCoffee(boolean isTired, int coffeesHad, double moneyOnHand, boolean haveHadWater) {
		if (coffeesHad <= 1 && moneyOnHand > 5.0 && haveHadWater == true || isTired == true) {
			return true;
		} else {
			return false;
		}
	}
	
}
